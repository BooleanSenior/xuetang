package com.cn.xuetang.po;

public class CommentCustom extends  Comment{

    private String u_xm;
    private String u_photoPath;

    private  String c_time;
    private String c_fellgood;

    public String getU_xm() {
        return u_xm;
    }

    public void setU_xm(String u_xm) {
        this.u_xm = u_xm;
    }

    public String getU_photoPath() {
        return u_photoPath;
    }

    public void setU_photoPath(String u_photoPath) {
        this.u_photoPath = u_photoPath;
    }

    public String getC_time() {
        return c_time;
    }

    public void setC_time(String c_time) {
        this.c_time = c_time;
    }

    public String getC_fellgood() {
        return c_fellgood;
    }

    public void setC_fellgood(String c_fellgood) {
        this.c_fellgood = c_fellgood;
    }
}
