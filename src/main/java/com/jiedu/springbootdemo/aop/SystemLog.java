package com.jiedu.springbootdemo.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zaq on 2018/6/22
 */


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SystemLog {

    String description() default "*";
}
