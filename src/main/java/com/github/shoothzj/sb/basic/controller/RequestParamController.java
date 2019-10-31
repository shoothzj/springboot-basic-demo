package com.github.shoothzj.sb.basic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RequestParamController {

    private static final Logger logger = LoggerFactory.getLogger(RequestParamController.class);

    @RequestMapping(path = "/param")
    public ResponseEntity<Void> upload(@RequestParam(name = "name") String name,
                                       HttpServletRequest httpServletRequest) {
        String name1 = httpServletRequest.getParameter("name");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(path = "/param", method = RequestMethod.POST)
    public ResponseEntity<Void> uploadPost(@RequestParam(name = "name") String name,
                                       HttpServletRequest httpServletRequest) {
        String name1 = httpServletRequest.getParameter("name");
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
