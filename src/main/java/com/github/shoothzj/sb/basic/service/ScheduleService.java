package com.github.shoothzj.sb.basic.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author hezhangjian
 * @see com.github.shoothzj.sb.basic.config.ScheduleConfig
 * 使用定时任务,需要在Main哪里加上@EnableScheduling
 * 使用spring的定时任务,不需要捕获异常
 */
@Slf4j
@Service
public class ScheduleService {

    /**
     * 一分钟执行一次的定时任务
     */
    @Scheduled(cron = "0 * * * * ?")
    public void schedule() {
        log.info("One minute schedule job.");
    }

}