package com.jiedu.springbootdemo.dao.service.impl;

import com.jiedu.springbootdemo.dao.SysConfig;
import com.jiedu.springbootdemo.dao.mapper.SysConfigMapper;
import com.jiedu.springbootdemo.dao.service.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements Test {

    @Autowired
    SysConfigMapper sysConfigMapper;

    @Override
    public List<SysConfig> list() {
        List<SysConfig> list = sysConfigMapper.list();
        return list;
    }
}
