package com.github.shoothzj.sb.basic.log;

import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.AccessLog;
import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.valves.AccessLogValve;
import org.slf4j.Logger;

import java.io.CharArrayWriter;

/**
 * @author hezhangjian
 */
@Slf4j
public class TomcatLogValve extends AccessLogValve implements AccessLog {

    public TomcatLogValve() {
        super();
        setPattern("%h %l %u %t %m %H %U %s %b %D %I");
    }

    @Override
    public void log(Request request, Response response, long time) {
        super.log(request, response, time);
    }

    @Override
    public void log(CharArrayWriter message) {
        log.info(message.toString());
    }
}
