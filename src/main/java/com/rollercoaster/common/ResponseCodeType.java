package com.rollercoaster.common;


public enum ResponseCodeType {


    SUCCESS_CODE("0000", "成功"),
    FAIL_CODE("1000", "失败"),
    ERROR_SYSTEM_CODE("", "系统错误"),
    ERROR_OTHER_CODE("9999", "其他错误"),
    ;

    private String code;
    private String message;

    ResponseCodeType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage(){
        return message;
    }
}



