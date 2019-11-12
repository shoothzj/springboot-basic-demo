package com.github.shoothzj.sb.basic.config;

import com.github.shoothzj.sb.basic.interceptor.LogCostInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author hezhangjian
 */
@Slf4j
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    private LogCostInterceptor logCostInterceptor;

    public InterceptorConfig(@Autowired LogCostInterceptor logCostInterceptor) {
        this.logCostInterceptor = logCostInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logCostInterceptor);
    }

}
