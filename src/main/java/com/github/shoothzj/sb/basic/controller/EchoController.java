package com.github.shoothzj.sb.basic.controller;

import com.github.shoothzj.sb.basic.module.EchoPostReq;
import com.github.shoothzj.sb.basic.module.EchoPostResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
@Api(value = "Echo")
public class EchoController {

    @ApiOperation(value = "echo your post body")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success echo")
    })
    @PostMapping(path = "/echo")
    public ResponseEntity<EchoPostResp> echo(@RequestBody EchoPostReq echoPostReq) {
        EchoPostResp resp = new EchoPostResp();
        resp.setContent(echoPostReq.getContent());
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

}
