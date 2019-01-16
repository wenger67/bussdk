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
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.tencentmap.mapsdk.map.MapView;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import com.vinson.bussdk.R;

import java.util.List;

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

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busline);
        mapView = findViewById(R.id.map_view);
        mapView.onCreate(savedInstanceState);
        tencentMap = mapView.getMap();
    }

    @Override protected void onResume() {
        mapView.onResume();
        super.onResume();
        TencentLocationManager locationManager = TencentLocationManager.getInstance(this);
        TencentLocationRequest locationRequest = TencentLocationRequest.create()
                .setRequestLevel(TencentLocationRequest.REQUEST_LEVEL_POI);
        int ret = locationManager.requestLocationUpdates(locationRequest, this);
        Log.d(TAG, "request result : " + ret);
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
        Log.d(TAG, tencentLocation.getLatitude() + ", " + tencentLocation.getLongitude());
        Log.d(TAG, tencentLocation.getDistrict());
        List<TencentPoi> pois = tencentLocation.getPoiList();
        for (TencentPoi poi : pois) {
            Log.d(TAG, poi.getAddress() + ", " +poi.getName());
        }
        tencentMap.setZoom(18);
        tencentMap.setCenter(new LatLng(tencentLocation.getLatitude(), tencentLocation
                .getLongitude()));
    }

    @Override public void onStatusUpdate(String s, int i, String s1) {

    }
}
