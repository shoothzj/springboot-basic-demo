package com.github.shoothzj.sb.basic.controller;

import com.github.shoothzj.sb.basic.log.Log;
import com.github.shoothzj.sb.basic.log.LogLevel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author hezhangjian
 */
@Slf4j
public class HealthCheckController {

    @GetMapping(path = "/liveness")
    @Log(level = LogLevel.INFO)
    public ResponseEntity<Void> getEcho() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
