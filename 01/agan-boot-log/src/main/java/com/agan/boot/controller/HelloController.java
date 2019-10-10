package com.agan.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 阿甘
 * @see 课程地址：https://study.163.com/course/courseMain.htm?courseId=1004348001&share=2&shareId=1016671292
 * @version 1.0
 * 注：如有任何疑问欢迎加入QQ群977438372 进行讨论
 */
@RestController
public class HelloController {
    private static  final Logger logger= LoggerFactory.getLogger(HelloController.class);

    @Value("${agan.msg}")
    private  String msg;

    @GetMapping("msg")
    public String getMsg() {
        return msg;
    }

    @GetMapping("/home")
    public String home(){
        return "hello agan!";
    }

    @GetMapping("/log")
    public void log(){
        logger.trace("------------trace-----------");
        logger.debug("------------debug-----------");
        logger.info("------------info-----------");
        logger.warn("------------warn-----------");
        logger.error("------------error-----------");

    }
}
