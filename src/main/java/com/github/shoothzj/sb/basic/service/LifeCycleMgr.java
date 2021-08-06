package com.github.shoothzj.sb.basic.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author hezhangjian
 */
@Slf4j
@Component
public class LifeCycleMgr implements ApplicationListener<ApplicationEvent> {

    @PostConstruct
    public void init() {
        log.info("post construct");
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        log.info("springboot application ready {}", event);
    }

}
