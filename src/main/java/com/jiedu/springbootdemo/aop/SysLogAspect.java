package com.jiedu.springbootdemo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * Created by zaq on 2018/6/22
 */

@Component
@Aspect
public class SysLogAspect {

    private final static Logger logger = LoggerFactory.getLogger(SysLogAspect.class);

    @Pointcut("@annotation(com.jiedu.springbootdemo.aop.SystemLog)")
    public void logPointCut(){

    }

    @Before("logPointCut()")//在调用上面 @Pointcut标注的方法前执行以下方法
    public void doBefore(JoinPoint joinPoint){//用于获取类方法
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request =  attributes.getRequest();
        //url
        logger.info("url ={}",request.getRequestURI());
        //method
        logger.info("method={}",request.getMethod());
        //ip
        logger.info("ip={}",request.getRemoteAddr());
        //类方法
        logger.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName()+'.'+ joinPoint.getSignature().getName());//获取类名及类方法
        //参数
        logger.info("args={}",joinPoint.getArgs());

        String targetName = joinPoint.getTarget().getClass().getName();

//        Method[] methods = Class.forName(targetName).getMethods();
//        for (Method method : methods) {
//            if (method.getName().equals(methodName)) {
//                Class[] classes = method.getParameterTypes();
//                if (classes.length == arguments.length) {
//                    //取入参数据
//                    String description = method.getAnnotation(SystemLog.class).description();
//                    logger.info("rizhi={}" + description) ;
//                    break;
//                }
//            }
//        }
    }

    @After("logPointCut()")//无论Controller中调用方法以何种方式结束，都会执行
    public void doAfter(){
        logger.info("----doAfter-----------");
    }


}
