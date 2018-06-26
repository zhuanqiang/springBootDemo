package com.jiedu.springbootdemo.dao.mapper;

import com.jiedu.springbootdemo.core.BaseMapper;
import com.jiedu.springbootdemo.dao.SysConfig;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository  // intellij比eclipse对代码的检查更为严格，导致此处不通过，然而并不影响使用。要想不报错，请抛开网上传言的各种将spring的error改成warnings、将项目从spring里删除、或者扬言这个是intellij的bug之类治标不治本的谣言，直接按照严格的spring注解方式来就可以，intellij是无辜的。
//@Mapper
public interface SysConfigMapper extends BaseMapper<SysConfig> {
    List<SysConfig> list ();

}
