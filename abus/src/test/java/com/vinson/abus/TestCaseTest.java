/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.vinson.abus;

import com.vinson.abus.core.CoreMthod;
import com.vinson.abus.core.SearchLinesServer;
import com.vinson.abus.model.BusLine;

import org.junit.After;
import org.junit.Test;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static org.junit.Assert.*;

public class TestCaseTest {
    List<BusLine> busLines;

    @Test
    public void test1() {
        Retrofit retrofit = CoreMthod.getINSTANCE().retrofit;
        SearchLinesServer searchLinesServer = retrofit.create(SearchLinesServer.class);
        Call<List<BusLine>> responseBodyCall = searchLinesServer.getSearchLines("1");
        responseBodyCall.enqueue(new Callback<List<BusLine>>() {
            @Override
            public void onResponse(Call<List<BusLine>> call, Response<List<BusLine>> response) {
                System.out.println(response.body().size());
                busLines = response.body();
            }

            @Override
            public void onFailure(Call<List<BusLine>> call, Throwable t) {

            }
        });
    }

    @After
    public void tearDown() throws Exception {
        busLines.get(0).toString();
    }
}