package com.jiedu.springbootdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final static Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("/")
    public String index(){
        logger.info("日志记录~~~~~~~~");
        return "spring boot ~！！~~~~ ";
    }
}
