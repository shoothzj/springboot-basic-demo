package com.github.shoothzj.sb.basic.controller;

import com.github.shoothzj.sb.basic.log.Log;
import com.github.shoothzj.sb.basic.log.LogLevel;
import com.github.shoothzj.sb.basic.module.EmptyDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hezhangjian
 */
@Slf4j
@RestController
public class EmptyDtoTestController {

    @GetMapping(path = "/emptyDTO/test")
    @Log(level = LogLevel.INFO)
    public ResponseEntity<EmptyDTO> getEcho() {
        EmptyDTO emptyDTO = new EmptyDTO();
        return new ResponseEntity<>(emptyDTO, HttpStatus.OK);
    }

}
