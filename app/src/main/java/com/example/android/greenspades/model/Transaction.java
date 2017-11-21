package com.example.android.greenspades.model;

/**
 * Created by archi on 21-11-2017.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Transaction {

    @SerializedName("_id")
    @Expose
    private Integer id;
    @SerializedName("customer")
    @Expose
    private Customer customer;
    @SerializedName("createdDate")
    @Expose
    private String createdDate;
    @SerializedName("transactionDate")
    @Expose
    private String transactionDate;
    @SerializedName("agentId")
    @Expose
    private Integer agentId;
    @SerializedName("merchantId")
    @Expose
    private Integer merchantId;
    @SerializedName("totalAmount")
    @Expose
    private Integer totalAmount;
    @SerializedName("totalTax")
    @Expose
    private Integer totalTax;
    @SerializedName("itemsCost")
    @Expose
    private Integer itemsCost;
    @SerializedName("amountPaid")
    @Expose
    private Integer amountPaid;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("taxes")
    @Expose
    private List<Tax_> taxes = null;
    @SerializedName("spadesEarned")
    @Expose
    private Integer spadesEarned;
    @SerializedName("spadesUsedItem")
    @Expose
    private Integer spadesUsedItem;
    @SerializedName("spadesUsed")
    @Expose
    private Integer spadesUsed;
    @SerializedName("items")
    @Expose
    private List<Object> items = null;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("incentiveId")
    @Expose
    private Integer incentiveId;
    @SerializedName("incentiveName")
    @Expose
    private String incentiveName;
    @SerializedName("dateTransaction")
    @Expose
    private String dateTransaction;
    @SerializedName("timeTransaction")
    @Expose
    private String timeTransaction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(Integer totalTax) {
        this.totalTax = totalTax;
    }

    public Integer getItemsCost() {
        return itemsCost;
    }

    public void setItemsCost(Integer itemsCost) {
        this.itemsCost = itemsCost;
    }

    public Integer getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Integer amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Tax_> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<Tax_> taxes) {
        this.taxes = taxes;
    }

    public Integer getSpadesEarned() {
        return spadesEarned;
    }

    public void setSpadesEarned(Integer spadesEarned) {
        this.spadesEarned = spadesEarned;
    }

    public Integer getSpadesUsedItem() {
        return spadesUsedItem;
    }

    public void setSpadesUsedItem(Integer spadesUsedItem) {
        this.spadesUsedItem = spadesUsedItem;
    }

    public Integer getSpadesUsed() {
        return spadesUsed;
    }

    public void setSpadesUsed(Integer spadesUsed) {
        this.spadesUsed = spadesUsed;
    }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public Integer getIncentiveId() {
        return incentiveId;
    }

    public void setIncentiveId(Integer incentiveId) {
        this.incentiveId = incentiveId;
    }

    public String getIncentiveName() {
        return incentiveName;
    }

    public void setIncentiveName(String incentiveName) {
        this.incentiveName = incentiveName;
    }

    public String getDateTransaction() {
        return dateTransaction==null?"":dateTransaction;
    }

    public void setDateTransaction(String dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public String getTimeTransaction() {
        return timeTransaction;
    }

    public void setTimeTransaction(String timeTransaction) {
        this.timeTransaction = timeTransaction;
    }

}