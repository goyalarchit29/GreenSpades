package com.example.android.greenspades.model;

/**
 * Created by archi on 21-11-2017.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Kpi {

    @SerializedName("text1")
    @Expose
    private String text1;
    @SerializedName("text2")
    @Expose
    private String text2;
    @SerializedName("text3")
    @Expose
    private String text3;
    @SerializedName("value")
    @Expose
    private Integer value;

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }

    public Integer getValue() {
        return value==null?0:value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}