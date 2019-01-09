package com.vinson.abus.model;

/**
 * project:bussdk
 * email: zhanwit@163.com
 * time: 2019/1/9 16:55
 * author: Vinson. Zhan
 * comment: ${DESCRIPTION}
 */

// "stopId":"027-I-4048","stopName":"九峰一路光谷公共服务中心","lng":114.49884509519804,
// "lat":30.493137886280536,"stopOrder":7,"metro":""
public class StopStation {
    private String mStopId;
    private String mStopName;
    private double mLongitude;
    private double mLatitude;
    private int mStopOrder;
    private String mMetro;

    public StopStation(String mStopId, String mStopName, double mLongitude, double mLatitude,
                       int mStopOrder, String mMetro) {
        this.mStopId = mStopId;
        this.mStopName = mStopName;
        this.mLongitude = mLongitude;
        this.mLatitude = mLatitude;
        this.mStopOrder = mStopOrder;
        this.mMetro = mMetro;
    }

    public String getStopId() {
        return mStopId;
    }

    public String getStopName() {
        return mStopName;
    }

    public double getLongitude() {
        return mLongitude;
    }

    public double getLatitude() {
        return mLatitude;
    }

    public int getStopOrder() {
        return mStopOrder;
    }

    public String getMetro() {
        return mMetro;
    }

    @Override
    public String toString() {
        return "StopStation{" +
                "mStopId='" + mStopId + '\'' +
                ", mStopName='" + mStopName + '\'' +
                ", mLongitude=" + mLongitude +
                ", mLatitude=" + mLatitude +
                ", mStopOrder=" + mStopOrder +
                ", mMetro='" + mMetro + '\'' +
                '}';
    }
}
