package com.jiedu.springbootdemo.Controller;


import com.jiedu.springbootdemo.dao.SysConfig;
import com.jiedu.springbootdemo.dao.mapper.SysConfigMapper;
import com.jiedu.springbootdemo.dao.service.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    Test test;

    @RequestMapping("/")
    public String index (){
        List<SysConfig> list =test.list();
        if(list != null && list.size() > 0 ){
            return "SUCCESS";
        }else {
            return "FAILED";
        }
    }

}
