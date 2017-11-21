package com.example.android.greenspades.model;

/**
 * Created by archi on 21-11-2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tax_ {

    @SerializedName("taxName")
    @Expose
    private String taxName;
    @SerializedName("taxId")
    @Expose
    private Integer taxId;
    @SerializedName("taxPercent")
    @Expose
    private Double taxPercent;
    @SerializedName("taxAmount")
    @Expose
    private Integer taxAmount;
    @SerializedName("_id")
    @Expose
    private String id;

    public String getTaxName() {
        return taxName;
    }

    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    public Integer getTaxId() {
        return taxId;
    }

    public void setTaxId(Integer taxId) {
        this.taxId = taxId;
    }

    public Double getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(Double taxPercent) {
        this.taxPercent = taxPercent;
    }

    public Integer getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Integer taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}