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

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ServiceApi {
    @GET("search.do?type=line")
    Call<BusLineSearchResult> getSearchLines(@Query("keyword") String keyword);

    @GET("line/{lineNo}/{direction}.do")
    Call<LineDetailSearchResult> getLineDetailByLineNo(
            @Path("lineNo") String lineNo, @Path("direction") int direction);

    @GET("nearby/lines/{lng}/{lat}.do")
    Call<NearbyLineSearchResult> getNearbyLines(@Path("lng") double lng, @Path("lat") double lat);

    @GET("search.do")
    Call<StopSearchResult> getStopsByStopName(@Query("keyword") String stopName);

    @GET("stop/group/{stopId}.do")
    Call<StopGroupSearchResult> getStopGroupByStopId(@Path("stopId") String stopId);
}
