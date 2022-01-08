package com.github.shoothzj.sb.basic.config;

import com.github.shoothzj.sb.basic.channel.SimpleLogRejectHandler;
import io.netty.util.concurrent.DefaultThreadFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * @author hezhangjian
 */
@Slf4j
@Configuration
public class ScheduleConfig implements SchedulingConfigurer {

    @Value(value = "${akkascala.schedule.threadNum}")
    private int threadNum;

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        ScheduledThreadPoolExecutor executor =
                new ScheduledThreadPoolExecutor(threadNum,
                        new DefaultThreadFactory("Schedule Pool"),
                        new SimpleLogRejectHandler());
        taskRegistrar.setScheduler(executor);
    }
}
