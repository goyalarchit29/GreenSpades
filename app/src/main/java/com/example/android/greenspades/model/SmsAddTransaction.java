package com.example.android.greenspades.model;

/**
 * Created by archi on 21-11-2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SmsAddTransaction {

    @SerializedName("send")
    @Expose
    private Boolean send;
    @SerializedName("orderText")
    @Expose
    private String orderText;
    @SerializedName("footer")
    @Expose
    private String footer;
    @SerializedName("h1")
    @Expose
    private String h1;
    @SerializedName("h2")
    @Expose
    private String h2;
    @SerializedName("h3")
    @Expose
    private String h3;
    @SerializedName("h4")
    @Expose
    private String h4;
    @SerializedName("h5")
    @Expose
    private String h5;
    @SerializedName("h6")
    @Expose
    private String h6;
    @SerializedName("h7")
    @Expose
    private String h7;

    public Boolean getSend() {
        return send;
    }

    public void setSend(Boolean send) {
        this.send = send;
    }

    public String getOrderText() {
        return orderText;
    }

    public void setOrderText(String orderText) {
        this.orderText = orderText;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getH1() {
        return h1;
    }

    public void setH1(String h1) {
        this.h1 = h1;
    }

    public String getH2() {
        return h2;
    }

    public void setH2(String h2) {
        this.h2 = h2;
    }

    public String getH3() {
        return h3;
    }

    public void setH3(String h3) {
        this.h3 = h3;
    }

    public String getH4() {
        return h4;
    }

    public void setH4(String h4) {
        this.h4 = h4;
    }

    public String getH5() {
        return h5;
    }

    public void setH5(String h5) {
        this.h5 = h5;
    }

    public String getH6() {
        return h6;
    }

    public void setH6(String h6) {
        this.h6 = h6;
    }

    public String getH7() {
        return h7;
    }

    public void setH7(String h7) {
        this.h7 = h7;
    }

}