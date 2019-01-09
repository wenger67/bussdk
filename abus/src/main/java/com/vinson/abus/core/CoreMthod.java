package com.vinson.abus.core;

import com.vinson.abus.utils.Constants;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CoreMthod {

    private static CoreMthod INSTANCE = new CoreMthod();

    private CoreMthod() {
    }

    public static CoreMthod getINSTANCE() {
        return INSTANCE;
    }

    public Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Constants.BASE_SERVER + Constants.CITY_ID)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
