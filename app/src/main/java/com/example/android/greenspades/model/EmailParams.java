package com.example.android.greenspades.model;

/**
 * Created by archi on 21-11-2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmailParams {

    @SerializedName("orderEmail")
    @Expose
    private String orderEmail;
    @SerializedName("subject")
    @Expose
    private String subject;
    @SerializedName("footer")
    @Expose
    private String footer;

    public String getOrderEmail() {
        return orderEmail;
    }

    public void setOrderEmail(String orderEmail) {
        this.orderEmail = orderEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

}