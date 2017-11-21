package com.example.android.greenspades.model;

/**
 * Created by archi on 21-11-2017.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UiFlows {

    @SerializedName("entryButton")
    @Expose
    private List<Integer> entryButton = null;
    @SerializedName("showCustomerScreen")
    @Expose
    private Boolean showCustomerScreen;

    public List<Integer> getEntryButton() {
        return entryButton;
    }

    public void setEntryButton(List<Integer> entryButton) {
        this.entryButton = entryButton;
    }

    public Boolean getShowCustomerScreen() {
        return showCustomerScreen;
    }

    public void setShowCustomerScreen(Boolean showCustomerScreen) {
        this.showCustomerScreen = showCustomerScreen;
    }

}
