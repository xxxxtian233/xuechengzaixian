package com.xuecheng.base.exception;

import lombok.Data;

@Data
public class XueChengException extends RuntimeException{

    private String errMessage;

    public XueChengException() {

    }

    public XueChengException(String message) {
        super(message);
        this.errMessage = message;
    }

    public static void cast(String message){
        throw new XueChengException(message);
    }

    public static void cast(CommonError error){
        throw new XueChengException(error.getErrMessage());
    }
}
