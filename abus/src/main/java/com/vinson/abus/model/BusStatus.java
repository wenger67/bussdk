package com.vinson.abus.model;

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
    private int mNextStop; // 下一个站点
    private int mReachStop;// 1:到站 0:未到站
    private double mLongitude;
    private double mLatitude;

    public BusStatus(int mBusId, int mNextStop, int mReachStop, double mLongitude,
                     double mLatitude) {
        this.mBusId = mBusId;
        this.mNextStop = mNextStop;
        this.mReachStop = mReachStop;
        this.mLongitude = mLongitude;
        this.mLatitude = mLatitude;
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
