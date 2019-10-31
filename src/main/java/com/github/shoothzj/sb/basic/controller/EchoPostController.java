package com.github.shoothzj.sb.basic.controller;

import com.github.shoothzj.sb.basic.module.EchoPostReq;
import com.github.shoothzj.sb.basic.module.EchoPostResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hezhangjian
 */
@Slf4j
@RestController
public class EchoPostController {

    @PostMapping(path = "/echo")
    public ResponseEntity<EchoPostResp> echo(@RequestBody EchoPostReq echoPostReq) {
        EchoPostResp resp = new EchoPostResp();
        resp.setBody(echoPostReq.getBody());
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

}
