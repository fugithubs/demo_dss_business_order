package com.dss.order.controller;

public class JsonResult {

    public static final String RESULT_OK="ok";
    public static final String RESULT_ERROR="error";
    public static final String RESULT_FAIL="fail";

    private String status = null;
    private Object result = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
