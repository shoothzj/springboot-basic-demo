package com.github.shoothzj.sb.basic.log;

import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;

/**
 * @author hezhangjian
 */
@Slf4j
public class TomcatLogger implements Log {

    private final String prefix;

    public TomcatLogger() {
        prefix = "";
    }

    public TomcatLogger(String name) {
        prefix = name + "#";
    }

    @Override
    public boolean isDebugEnabled() {
        return false;
    }

    @Override
    public boolean isErrorEnabled() {
        return false;
    }

    @Override
    public boolean isFatalEnabled() {
        return false;
    }

    @Override
    public boolean isInfoEnabled() {
        return false;
    }

    @Override
    public boolean isTraceEnabled() {
        return false;
    }

    @Override
    public boolean isWarnEnabled() {
        return false;
    }

    @Override
    public void trace(Object o) {
        log.trace(prefix + o.toString());
    }

    @Override
    public void trace(Object o, Throwable throwable) {
        log.trace(prefix + o.toString() + throwable);
    }

    @Override
    public void debug(Object o) {
        log.debug(prefix + o.toString());
    }

    @Override
    public void debug(Object o, Throwable throwable) {
        log.debug(prefix + o.toString() + throwable);
    }

    @Override
    public void info(Object o) {
        log.info(prefix + o.toString());
    }

    @Override
    public void info(Object o, Throwable throwable) {
        log.info(prefix + o.toString() + throwable);
    }

    @Override
    public void warn(Object o) {
        log.warn(prefix + o.toString());
    }

    @Override
    public void warn(Object o, Throwable throwable) {
        log.warn(prefix + o.toString() + throwable);
    }

    @Override
    public void error(Object o) {
        log.error(prefix + o.toString());
    }

    @Override
    public void error(Object o, Throwable throwable) {
        log.error(prefix + o.toString() + throwable);

    }

    @Override
    public void fatal(Object o) {
        log.error(prefix + o.toString());
    }

    @Override
    public void fatal(Object o, Throwable throwable) {
        log.error(prefix + o.toString() + throwable);
    }
}
