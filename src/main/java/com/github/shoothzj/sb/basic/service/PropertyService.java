package com.github.shoothzj.sb.basic.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author hezhangjian
 */
@Slf4j
@PropertySource("classpath:property.yaml")
@Service
public class PropertyService implements Filter {

    @Autowired
    Environment env;

    private final UserService userService;

    public PropertyService(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void init() {
        log.info("name is {}", env.getProperty("name"));
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }
}
