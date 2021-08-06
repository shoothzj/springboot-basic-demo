package com.github.shoothzj.sb.basic.module;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author hezhangjian
 */
@Slf4j
@Data
public class OAuth2TokenRequest {

    private String usename;

    private String password;

    public OAuth2TokenRequest() {
    }

}
