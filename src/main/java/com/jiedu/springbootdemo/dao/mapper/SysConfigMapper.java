package com.jiedu.springbootdemo.dao.mapper;

import com.jiedu.springbootdemo.dao.SysConfig;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface SysConfigMapper {
    List<SysConfig> list ();

}
