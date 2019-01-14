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

// 5360|12|6|0|114.51370033748469|30.4891161047892

public class BusStatus {
    private int mBusId;
    private int mNextStop; // next station
    private int mReachStop;// 1:reach 0:not reach
    private double mLongitude;
    private double mLatitude;

    public BusStatus(String str) {
        // "51802|12|4|0|114.39850974964217|30.501058398660536"
        String[] fileds = str.split("[|]");
        this.mBusId = Integer.valueOf(fileds[0]);
        this.mNextStop = Integer.valueOf(fileds[2]);
        this.mReachStop = Integer.valueOf(fileds[3]);
        this.mLongitude = Double.valueOf(fileds[4]);
        this.mLatitude = Double.valueOf(fileds[5]);
    }

    public int getBusId() {
        return mBusId;
    }

    public int getNextStop() {
        return mNextStop;
    }

    public int getReachStop() {
        return mReachStop;
    }

    public double getLongitude() {
        return mLongitude;
    }

    public double getLatitude() {
        return mLatitude;
    }

    @Override
    public String toString() {
        return "BusStatus{" +
                "mBusId=" + mBusId +
                ", mNextStop=" + mNextStop +
                ", mReachStop=" + mReachStop +
                ", mLongitude=" + mLongitude +
                ", mLatitude=" + mLatitude +
                '}';
    }
}
