package com.vinson.abus.model;

/**
 * "stopId":"027-I-4048","stopName":"九峰一路光谷公共服务中心","lng":114.49884509519804,"lat":30.493137886280536,"stopOrder":18,"metro":""
 */
public class StopStation {
    String mStopId;
    String mStopName;
    double mLongitude;
    double mLatitude;
    int mStopOrder;
    String mMetro;

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
}
