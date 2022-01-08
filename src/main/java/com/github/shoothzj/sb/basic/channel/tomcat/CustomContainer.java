package com.github.shoothzj.sb.basic.channel.tomcat;

import com.github.shoothzj.sb.basic.log.TomcatLogValve;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

/**
 * @author hezhangjian
 */
@Component
public class CustomContainer implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {

    @Override
    public void customize(TomcatServletWebServerFactory factory) {
        factory.addEngineValves(new TomcatLogValve());
    }
}
