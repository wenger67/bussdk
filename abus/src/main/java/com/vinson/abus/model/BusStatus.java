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
    int mBusId;
    int mNextStop; // 下一个站点
    int mReachStop;// 1:到站 0:未到站
    double mLongitude;
    double mLatitude;
}
