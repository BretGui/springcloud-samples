package com.bretgui.geoservice.common;

public class ResultJson {

    private int status;
    private String msg;
    private Object data;

    public ResultJson(){
        this.status = 200;
        this.msg = "ok";
        this.data = null;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
