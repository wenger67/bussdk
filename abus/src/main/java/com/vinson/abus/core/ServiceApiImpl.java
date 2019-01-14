/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.vinson.abus.core;

import com.vinson.abus.model.BusLineSearchResult;
import com.vinson.abus.model.LineDetailSearchResult;
import com.vinson.abus.model.NearbyLineSearchResult;
import com.vinson.abus.model.StopGroupSearchResult;
import com.vinson.abus.model.StopSearchResult;
import com.vinson.abus.utils.Constants;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * project:bussdk
 * email: zhanwit@163.com
 * time: 2019/1/14 14:39
 * author: Vinson. Zhan
 * comment: ${DESCRIPTION}
 */
public class ServiceApiImpl implements ServiceApi {

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Constants.BASE_SERVER)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private static ServiceApiImpl INSTANCE;
    private static ServiceApi serviceApi = retrofit.create(ServiceApi.class);

    private ServiceApiImpl() {
    }

    public static ServiceApiImpl getInstance() {
        if (INSTANCE == null)
            INSTANCE = new ServiceApiImpl();
        return INSTANCE;
    }


    @Override public Call<BusLineSearchResult> getSearchLines(String keyword) {
        return serviceApi.getSearchLines(keyword);
    }

    @Override public Call<LineDetailSearchResult> getLineDetailByLineNo(String lineNo, int direction) {
        return serviceApi.getLineDetailByLineNo(lineNo, direction);
    }

    @Override public Call<NearbyLineSearchResult> getNearbyLines(double lng, double lat) {
        return serviceApi.getNearbyLines(lng, lat);
    }

    @Override public Call<StopSearchResult> getStopsByStopName(String stopName) {
        return serviceApi.getStopsByStopName(stopName);
    }

    @Override public Call<StopGroupSearchResult> getStopGroupByStopId(String stopId) {
        return serviceApi.getStopGroupByStopId(stopId);
    }
}
