package com.example.android.greenspades.model;

/**
 * Created by archi on 21-11-2017.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("_id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("mobileNumber")
    @Expose
    private String mobileNumber;
    @SerializedName("tinNumber")
    @Expose
    private String tinNumber;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("billDisplayName")
    @Expose
    private String billDisplayName;
    @SerializedName("billMobileNumber")
    @Expose
    private String billMobileNumber;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("userID")
    @Expose
    private String userID;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("isActive")
    @Expose
    private Integer isActive;
    @SerializedName("orderNumber")
    @Expose
    private Integer orderNumber;
    @SerializedName("isSubscribed")
    @Expose
    private Integer isSubscribed;
    @SerializedName("feedbackScale")
    @Expose
    private List<Integer> feedbackScale = null;
    @SerializedName("feedbackParams")
    @Expose
    private List<String> feedbackParams = null;
    @SerializedName("emailParams")
    @Expose
    private EmailParams emailParams;
    @SerializedName("smsParams")
    @Expose
    private SmsParams smsParams;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("smsAddTransaction")
    @Expose
    private SmsAddTransaction smsAddTransaction;
    @SerializedName("smsSpades")
    @Expose
    private SmsSpades smsSpades;
    @SerializedName("uiFlows")
    @Expose
    private UiFlows uiFlows;
    @SerializedName("transactionDelta")
    @Expose
    private Integer transactionDelta;
    @SerializedName("taxes")
    @Expose
    private List<Tax> taxes = null;
    @SerializedName("kpis")
    @Expose
    private List<Kpi> kpis = null;
    @SerializedName("transactions")
    @Expose
    private List<Transaction> transactions = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getTinNumber() {
        return tinNumber;
    }

    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBillDisplayName() {
        return billDisplayName;
    }

    public void setBillDisplayName(String billDisplayName) {
        this.billDisplayName = billDisplayName;
    }

    public String getBillMobileNumber() {
        return billMobileNumber;
    }

    public void setBillMobileNumber(String billMobileNumber) {
        this.billMobileNumber = billMobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getIsSubscribed() {
        return isSubscribed;
    }

    public void setIsSubscribed(Integer isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    public List<Integer> getFeedbackScale() {
        return feedbackScale;
    }

    public void setFeedbackScale(List<Integer> feedbackScale) {
        this.feedbackScale = feedbackScale;
    }

    public List<String> getFeedbackParams() {
        return feedbackParams;
    }

    public void setFeedbackParams(List<String> feedbackParams) {
        this.feedbackParams = feedbackParams;
    }

    public EmailParams getEmailParams() {
        return emailParams;
    }

    public void setEmailParams(EmailParams emailParams) {
        this.emailParams = emailParams;
    }

    public SmsParams getSmsParams() {
        return smsParams;
    }

    public void setSmsParams(SmsParams smsParams) {
        this.smsParams = smsParams;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public SmsAddTransaction getSmsAddTransaction() {
        return smsAddTransaction;
    }

    public void setSmsAddTransaction(SmsAddTransaction smsAddTransaction) {
        this.smsAddTransaction = smsAddTransaction;
    }

    public SmsSpades getSmsSpades() {
        return smsSpades;
    }

    public void setSmsSpades(SmsSpades smsSpades) {
        this.smsSpades = smsSpades;
    }

    public UiFlows getUiFlows() {
        return uiFlows;
    }

    public void setUiFlows(UiFlows uiFlows) {
        this.uiFlows = uiFlows;
    }

    public Integer getTransactionDelta() {
        return transactionDelta;
    }

    public void setTransactionDelta(Integer transactionDelta) {
        this.transactionDelta = transactionDelta;
    }

    public List<Tax> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<Tax> taxes) {
        this.taxes = taxes;
    }

    public List<Kpi> getKpis() {
        return kpis;
    }

    public void setKpis(List<Kpi> kpis) {
        this.kpis = kpis;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

}