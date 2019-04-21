package com.yyl.flyplus.controller;

import com.yyl.flyplus.model.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

public class BaseController {

    @Autowired
    private HttpServletRequest request;


    public <T> BaseResponse<T> asOk(String message, T data){
        BaseResponse<T> response= new BaseResponse<T>();
        response.setCode(20000);
        response.setData( data);
        response.setMessage(message);
        return  response;
    }



    public <T>  BaseResponse asException(Exception ex,String  message){
        BaseResponse<T> response= new BaseResponse<T>();
        response.setCode(50000);
        response.setData(null);
        response.setMessage(message+":"+ex.getMessage());
        return response;
    }

    public <T>  BaseResponse<T> asFailed(String message, T data){
        BaseResponse<T> response= new BaseResponse<T>();
        response.setCode(51000);
        response.setData(null);
        response.setMessage(message);
        return response;
    }

    public <T>  BaseResponse<T> asFailed(String message){
        BaseResponse<T> response= new BaseResponse<T>();
        response.setCode(50123);
        response.setData(null);
        response.setMessage(message);
        return response;
    }
}
