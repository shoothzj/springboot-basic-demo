package com.github.shoothzj.sb.basic.config;

import com.github.shoothzj.sb.basic.filter.LogCostFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * @author hezhangjian
 */
@Slf4j
@Configuration
public class FilterConfig {

    private LogCostFilter logCostFilter;

    public FilterConfig(@Autowired LogCostFilter logCostFilter) {
        this.logCostFilter = logCostFilter;
    }

    @Bean
    public FilterRegistrationBean registFilter() {
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<>();
        registration.setFilter(logCostFilter);
        registration.addUrlPatterns("/*");
        registration.setName("LogCostFilter");
        registration.setOrder(1);
        return registration;
    }

}
