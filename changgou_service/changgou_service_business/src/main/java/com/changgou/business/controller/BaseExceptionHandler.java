package com.changgou.business.controller;
import com.changgou.entity.Result;
import com.changgou.entity.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理类
 */
@ControllerAdvice//声明该类是个增强类
public class BaseExceptionHandler {

    //重点是两个注解：@ControllerAdvice   @ExceptionHandler
	
    @ExceptionHandler(value = Exception.class) //声明对那个异常进行处理
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();        
        return new Result(false, StatusCode.ERROR, "当前系统繁忙，请您稍后重试！");
    }
}
