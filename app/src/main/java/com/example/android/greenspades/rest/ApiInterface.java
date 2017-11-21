package com.example.android.greenspades.rest;

/**
 * Created by archi on 21-11-2017.
 */
import com.example.android.greenspades.model.Example;
import com.example.android.greenspades.model.Kpi;
import com.example.android.greenspades.model.Transaction;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {
    @GET("api/v1/greenspades/data")
    Call<Example> getExample(@Query("tagged") String tags);
}