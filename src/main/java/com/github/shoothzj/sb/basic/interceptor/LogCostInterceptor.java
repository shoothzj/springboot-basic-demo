package com.github.shoothzj.sb.basic.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author hezhangjian
 */
@Slf4j
@Service
public class LogCostInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        RequestMapping methodAnnotation = handlerMethod.getMethodAnnotation(RequestMapping.class);
        if (methodAnnotation == null) {
            return true;
        }
        String[] value = methodAnnotation.value();
        if (value.length == 0) {
            //为什么length会等于0,因为没有匹配到任何url
            return true;
        }
        String mappedUrl = methodAnnotation.value()[0];
        log.info("url is [{}] mapping url is [{}]", request.getRequestURI(), mappedUrl);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) {

    }
}
