package com.springbootangular.todowebservice.basic.auth;

public class BasicAuthBean {

    private String message;

    public BasicAuthBean(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "BasicAuthBean{" +
                "message='" + message + '\'' +
                '}';
    }

}
