/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.vinson.abus.model.base;

/**
 * project:bussdk
 * email: zhanwit@163.com
 * time: 2019/1/9 16:55
 * author: Vinson. Zhan
 * comment: ${DESCRIPTION}
 */

public class StopStation {
    private String stopId;
    private String stopName;
    private double lng;
    private double lat;
    private int stopOrder;
    private String metro;

    public StopStation(String stopId, String stopName, double lng, double lat,
                       int stopOrder, String metro) {
        this.stopId = stopId;
        this.stopName = stopName;
        this.lng = lng;
        this.lat = lat;
        this.stopOrder = stopOrder;
        this.metro = metro;
    }

    public String getStopId() {
        return stopId;
    }

    public String getStopName() {
        return stopName;
    }

    public double getLongitude() {
        return lng;
    }

    public double getLatitude() {
        return lat;
    }

    public int getStopOrder() {
        return stopOrder;
    }

    public String getMetro() {
        return metro;
    }

    @Override
    public String toString() {
        return "StopStation{" +
                "stopId='" + stopId + '\'' +
                ", stopName='" + stopName + '\'' +
                ", lng=" + lng +
                ", lat=" + lat +
                ", stopOrder=" + stopOrder +
                ", metro='" + metro + '\'' +
                '}';
    }
}
