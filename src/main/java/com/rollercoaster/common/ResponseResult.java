package com.rollercoaster.common;

import java.util.HashMap;

public class ResponseResult extends HashMap<String, Object> {

    private static final long serialVersionUID = -1329913787117052748L;

    public ResponseResult message(String message) {
        this.put("msg", message);
        return this;
    }

    public ResponseResult data(Object data) {
        this.put("data", data);
        return this;
    }

    public ResponseResult code(String code) {
        this.put("code", code);
        return this;
    }


    public ResponseResult success(String message) {
        this.put("code", ResponseCodeType.SUCCESS_CODE.getCode());
        if(message!=null&&!message.isEmpty()){
            this.put("msg", message);
        }else
            this.put("msg", ResponseCodeType.SUCCESS_CODE.getMessage());
        return this;
    }

    public ResponseResult success() {
        return this.success(null);
    }

    public ResponseResult fail() {
        return this.success(null);
    }

    public ResponseResult fail(String message) {
        this.put("code", ResponseCodeType.SUCCESS_CODE.getCode());
        if(message!=null&&!message.isEmpty()){
            this.put("message", message);
        }else
            this.put("message", ResponseCodeType.SUCCESS_CODE.getMessage());
        return this;
    }

    @Override
    public ResponseResult put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
