package com.jiedu.springbootdemo.core;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/**
 * 通用配置mapper
 *
 * */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
