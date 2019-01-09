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

    private String mLineName;
    private String mLineId;
    private String mLineNo;
    private int mDirection;
    private String mStartStopName;
    private String mEndStopName;
    private String mFirstTime;
    private String mLastTime;
    private String mIntervalTime;
    private String mPrice;
    private int mStopCount;
    private double mMeasure;
    private String mBeBus;
    private String mLineToId;
    private int mNearBus;

    public BusLine(String mLineName, String mLineId, String mLineNo, int mDirection,
                   String mStartStopName, String mEndStopName, String mFirstTime,
                   String mLastTime, String mIntervalTime, String mPrice, int mStopCount,
                   double mMeasure, String mBeBus, String mLineToId, int mNearBus) {
        this.mLineName = mLineName;
        this.mLineId = mLineId;
        this.mLineNo = mLineNo;
        this.mDirection = mDirection;
        this.mStartStopName = mStartStopName;
        this.mEndStopName = mEndStopName;
        this.mFirstTime = mFirstTime;
        this.mLastTime = mLastTime;
        this.mIntervalTime = mIntervalTime;
        this.mPrice = mPrice;
        this.mStopCount = mStopCount;
        this.mMeasure = mMeasure;
        this.mBeBus = mBeBus;
        this.mLineToId = mLineToId;
        this.mNearBus = mNearBus;
    }

    public String getLineName() {
        return mLineName;
    }

    public String getLineId() {
        return mLineId;
    }

    public String getLineNo() {
        return mLineNo;
    }

    public int getDirection() {
        return mDirection;
    }

    public String getStartStopName() {
        return mStartStopName;
    }

    public String getEndStopName() {
        return mEndStopName;
    }

    public String getFirstTime() {
        return mFirstTime;
    }

    public String getLastTime() {
        return mLastTime;
    }

    public String getIntervalTime() {
        return mIntervalTime;
    }

    public String getPrice() {
        return mPrice;
    }

    public int getStopCount() {
        return mStopCount;
    }

    public double getMeasure() {
        return mMeasure;
    }

    public String getBeBus() {
        return mBeBus;
    }

    public String getLineToId() {
        return mLineToId;
    }

    public int getNearBus() {
        return mNearBus;
    }

    @Override
    public String toString() {
        return "BusLine{" +
                "mLineName='" + mLineName + '\'' +
                ", mLineId='" + mLineId + '\'' +
                ", mLineNo='" + mLineNo + '\'' +
                ", mDirection=" + mDirection +
                ", mStartStopName='" + mStartStopName + '\'' +
                ", mEndStopName='" + mEndStopName + '\'' +
                ", mFirstTime='" + mFirstTime + '\'' +
                ", mLastTime='" + mLastTime + '\'' +
                ", mIntervalTime='" + mIntervalTime + '\'' +
                ", mPrice='" + mPrice + '\'' +
                ", mStopCount=" + mStopCount +
                ", mMeasure=" + mMeasure +
                ", mBeBus='" + mBeBus + '\'' +
                ", mLineToId='" + mLineToId + '\'' +
                ", mNearBus=" + mNearBus +
                '}';
    }
}
