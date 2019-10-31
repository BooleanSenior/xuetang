package com.cn.xuetang.po;

import java.util.Date;

public class Knowledge {

    private long knowid;
    private long userid;
    private String knowlink;
    private String knowpaw;
    private String knowlabel;
    private String knowname;
    private String knowremark;
    private String knowlimittime;
    private Date knowcreattime;

    public long getKnowid() {
        return knowid;
    }

    public void setKnowid(long knowid) {
        this.knowid = knowid;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getKnowlink() {
        return knowlink;
    }

    public void setKnowlink(String knowlink) {
        this.knowlink = knowlink;
    }

    public String getKnowpaw() {
        return knowpaw;
    }

    public void setKnowpaw(String knowpaw) {
        this.knowpaw = knowpaw;
    }

    public String getKnowlabel() {
        return knowlabel;
    }

    public void setKnowlabel(String knowlabel) {
        this.knowlabel = knowlabel;
    }

    public String getKnowname() {
        return knowname;
    }

    public void setKnowname(String knowname) {
        this.knowname = knowname;
    }

    public String getKnowremark() {
        return knowremark;
    }

    public void setKnowremark(String knowremark) {
        this.knowremark = knowremark;
    }

    public String getKnowlimittime() {
        return knowlimittime;
    }

    public void setKnowlimittime(String knowlimittime) {
        this.knowlimittime = knowlimittime;
    }

    public Date getKnowcreattime() {
        return knowcreattime;
    }

    public void setKnowcreattime(Date knowcreattime) {
        this.knowcreattime = knowcreattime;
    }
}
