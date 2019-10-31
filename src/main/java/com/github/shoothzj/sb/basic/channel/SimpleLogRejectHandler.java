package com.github.shoothzj.sb.basic.channel;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author hezhangjian
 */
@Slf4j
public class SimpleLogRejectHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        log.warn("runnable is [{}], executor [{}] rejected", r, executor);
    }

}
