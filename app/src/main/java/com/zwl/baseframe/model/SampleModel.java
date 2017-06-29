package com.zwl.baseframe.model;

/**
 * @author velen
 * @date 2017/3/27
 */
public class SampleModel {
    private int code;
    private String message="default message";

    public int getCode() {
        return code;
    }

    public void setCode(final int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}
