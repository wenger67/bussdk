/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.vinson.abusdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationListener;
import com.tencent.map.geolocation.TencentLocationManager;
import com.tencent.map.geolocation.TencentLocationRequest;
import com.tencent.map.geolocation.TencentPoi;
import com.tencent.mapsdk.raster.model.BitmapDescriptorFactory;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.mapsdk.raster.model.MarkerOptions;
import com.tencent.tencentmap.mapsdk.map.MapView;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import com.vinson.abus.core.ServiceApiImpl;
import com.vinson.abus.model.LineDetailSearchResult;
import com.vinson.abus.model.base.StopStation;
import com.vinson.bussdk.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.vinson.abusdemo.MainActivity.EXTRA_LINE_NO;

/**
 * project:bussdk
 * email: zhanwit@163.com
 * time: 2019/1/16 16:38
 * author: Vinson. Zhan
 * comment: ${DESCRIPTION}
 */
public class BuslineActivity extends Activity implements TencentLocationListener {
    private static final String TAG = BuslineActivity.class.getSimpleName();

    MapView mapView;
    TencentMap tencentMap;
    Marker marker;
    String lineNo;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busline);
        mapView = findViewById(R.id.map_view);
        mapView.onCreate(savedInstanceState);
        tencentMap = mapView.getMap();
        lineNo = getIntent().getStringExtra(EXTRA_LINE_NO);

        initData();
        initEvent();
    }

    private void initData() {

    }

    private void initEvent() {
        tencentMap.setOnMarkerDraggedListener(new TencentMap.OnMarkerDraggedListener() {
            @Override public void onMarkerDrag(Marker marker) {

            }

            @Override public void onMarkerDragEnd(Marker marker) {
                Log.d(TAG, "end :" + marker.getPosition().toString());
                tencentMap.animateTo(marker.getPosition());
            }

            @Override public void onMarkerDragStart(Marker marker) {

            }
        });

        tencentMap.setOnMarkerClickListener((marker) ->{
            if (marker.isInfoWindowShown())
                marker.hideInfoWindow();
            else marker.showInfoWindow();
            return true;
        });
    }

    @Override protected void onResume() {
        Log.d(TAG, "onResume");
        mapView.onResume();
        super.onResume();

        if (lineNo != null && !lineNo.isEmpty()) {
            ServiceApiImpl.getInstance().getLineDetailByLineNo(lineNo, 0).enqueue(new Callback<LineDetailSearchResult>() {
                @Override
                public void onResponse(Call<LineDetailSearchResult> call, Response<LineDetailSearchResult> response) {
                    if (response.body() != null) {
                        Log.d(TAG, response.body().getData().toString());
                        List<StopStation> stopStations = response.body().getData().getStops();
                        tencentMap.animateTo(new LatLng(stopStations.get(0).getLatitude(), stopStations.get(0).getLongitude()));
                        tencentMap.setZoom(16);

                        for (StopStation s : stopStations) {
                            Marker marker = tencentMap.addMarker(new MarkerOptions().position(new LatLng(s.getLatitude(), s.getLongitude()))
                                    .title(s.getStopName()).anchor(0.5f, 0.5f).icon(BitmapDescriptorFactory.defaultMarker())
                                    .draggable(false));
                        }
                    }
                }
                @Override public void onFailure(Call<LineDetailSearchResult> call, Throwable t) {
                    Log.d(TAG, t.getMessage());
                }
            });
        }
    }

    @Override protected void onStop() {
        mapView.onStop();
        super.onStop();
    }

    @Override protected void onPause() {
        mapView.onPause();
        super.onPause();
    }

    @Override protected void onDestroy() {
        mapView.onDestroy();
        super.onDestroy();
    }

    @Override public void onLocationChanged(TencentLocation tencentLocation, int i, String s) {
    }

    @Override public void onStatusUpdate(String s, int i, String s1) {

    }
}
