package com.vinson.abus.model;

/**
 * project:bussdk
 * email: zhanwit@163.com
 * time: 2019/1/9 16:55
 * author: Vinson. Zhan
 * comment: ${DESCRIPTION}
 */


// "lineName":"536","lineId":"027-536-1","lineNo":"536","direction":1,
// "startStopName":"九峰三路未来科技城","endStopName":"珞雄路公交场站","firstTime":"6:40","lastTime":"20:40",
// "intervalTime":"","price":"1.0~2.0","stopsNum":23,"measure":0.0,"beBus":"","line2Id":"027-536-0"

public class BusLine {

    String mLineName;
    String mLineId;
    String mLineNo;
    int mDirection;
    String mStartStopName;
    String mEndStopName;
    String mFirstTime;
    String mLastTime;
    String mIntervalTime;
    String mPrice;
    int mStopCount;
    double mMeasure;
    String mBeBus;
    String mLineToId;
    int mNearBus;
}
