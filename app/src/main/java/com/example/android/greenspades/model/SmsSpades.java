package com.example.android.greenspades.model;

/**
 * Created by archi on 21-11-2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SmsSpades {

    @SerializedName("send")
    @Expose
    private Boolean send;
    @SerializedName("sendRemove")
    @Expose
    private Boolean sendRemove;
    @SerializedName("add1")
    @Expose
    private String add1;
    @SerializedName("add2")
    @Expose
    private String add2;
    @SerializedName("remove1")
    @Expose
    private String remove1;
    @SerializedName("remove2")
    @Expose
    private String remove2;

    public Boolean getSend() {
        return send;
    }

    public void setSend(Boolean send) {
        this.send = send;
    }

    public Boolean getSendRemove() {
        return sendRemove;
    }

    public void setSendRemove(Boolean sendRemove) {
        this.sendRemove = sendRemove;
    }

    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    public String getAdd2() {
        return add2;
    }

    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    public String getRemove1() {
        return remove1;
    }

    public void setRemove1(String remove1) {
        this.remove1 = remove1;
    }

    public String getRemove2() {
        return remove2;
    }

    public void setRemove2(String remove2) {
        this.remove2 = remove2;
    }

}