package com.github.shoothzj.sb.basic.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hezhangjian
 */
@Slf4j
@Configuration
public class HeartBeatConnector {

    @Value(value = "${akkascala.heartbeat.port}")
    private int heartPort;

    @Bean
    public TomcatServletWebServerFactory servletWebServerFactory() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.addAdditionalTomcatConnectors(createConnector());
        return tomcat;
    }

    public Connector createConnector() {
        try {
            Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
            connector.setScheme("http");
            connector.setPort(heartPort);
            connector.setSecure(false);
            Http11NioProtocol handler = (Http11NioProtocol) connector.getProtocolHandler();
            handler.setMaxKeepAliveRequests(3);
            handler.setKeepAliveTimeout(5000);
            handler.setMaxThreads(5);
            handler.setMinSpareThreads(2);
            return connector;
        } catch (Throwable e) {
            log.error("Failed to create Connector, port : {}, error : {}", 30000, e.getMessage());
        }
        return null;
    }


}
