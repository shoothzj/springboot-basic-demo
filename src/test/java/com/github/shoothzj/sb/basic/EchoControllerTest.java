package com.github.shoothzj.sb.basic;

import com.github.shoothzj.javatool.service.JacksonService;
import com.github.shoothzj.sb.basic.controller.EchoController;
import com.github.shoothzj.sb.basic.module.EchoPostReq;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author hezhangjian
 */
@Slf4j
@RunWith(SpringRunner.class)
@WebMvcTest(EchoController.class)
public class EchoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testEcho() throws Exception {
        EchoPostReq echoPostReq = new EchoPostReq();
        echoPostReq.setContent("req");
        mockMvc.perform(post("/echo")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(JacksonService.toJson(echoPostReq)))
                .andExpect(status().isOk());
    }

}
