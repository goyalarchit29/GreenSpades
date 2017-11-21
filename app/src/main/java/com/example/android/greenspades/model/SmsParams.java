package com.example.android.greenspades.model;

/**
 * Created by archi on 21-11-2017.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SmsParams {

    @SerializedName("orderText")
    @Expose
    private String orderText;
    @SerializedName("footer")
    @Expose
    private String footer;

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

}
