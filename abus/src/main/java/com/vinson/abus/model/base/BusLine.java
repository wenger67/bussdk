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

@SuppressWarnings("unused")
public class BusLine {

    private String lineName;
    private String lineId;
    private String lineNo;
    private int direction;
    private String startStopName;
    private String endStopName;
    private String firstTime;
    private String lastTime;
    private String intervalTime;
    private String price;
    private int stopsNum;
    private double measure;
    private String beBus;
    private String line2Id;
    private int nearBus;
    private String currentStopId;
    private String currentStopName;
    private String currentStopOrder;
    private String nextStopName;


    public int getStopsNum() {
        return stopsNum;
    }

    public String getCurrentStopId() {
        return currentStopId;
    }

    public String getCurrentStopName() {
        return currentStopName;
    }

    public String getCurrentStopOrder() {
        return currentStopOrder;
    }

    public String getNextStopName() {
        return nextStopName;
    }

    public String getLineName() {
        return lineName;
    }

    public String getLineId() {
        return lineId;
    }

    public String getLineNo() {
        return lineNo;
    }

    public int getDirection() {
        return direction;
    }

    public String getStartStopName() {
        return startStopName;
    }

    public String getEndStopName() {
        return endStopName;
    }

    public String getFirstTime() {
        return firstTime;
    }

    public String getLastTime() {
        return lastTime;
    }

    public String getIntervalTime() {
        return intervalTime;
    }

    public String getPrice() {
        return price;
    }

    public int getStopCount() {
        return stopsNum;
    }

    public double getMeasure() {
        return measure;
    }

    public String getBeBus() {
        return beBus;
    }

    public int getNearBus() {
        return nearBus;
    }

    public String getLine2Id() {
        return line2Id;
    }

    public BusLine(String lineName, String lineId, String lineNo, int direction, String
            startStopName, String endStopName, String firstTime, String lastTime, String
            intervalTime, String price, int stopsNum, double measure, String beBus, String
            line2Id, int nearBus, String currentStopId, String currentStopName, String
            currentStopOrder, String nextStopName) {
        this.lineName = lineName;
        this.lineId = lineId;
        this.lineNo = lineNo;
        this.direction = direction;
        this.startStopName = startStopName;
        this.endStopName = endStopName;
        this.firstTime = firstTime;
        this.lastTime = lastTime;
        this.intervalTime = intervalTime;
        this.price = price;
        this.stopsNum = stopsNum;
        this.measure = measure;
        this.beBus = beBus;
        this.line2Id = line2Id;
        this.nearBus = nearBus;
        this.currentStopId = currentStopId;
        this.currentStopName = currentStopName;
        this.currentStopOrder = currentStopOrder;
        this.nextStopName = nextStopName;
    }

    @Override public String toString() {
        return "BusLine{" +
                "lineName='" + lineName + '\'' +
                ", lineId='" + lineId + '\'' +
                ", lineNo='" + lineNo + '\'' +
                ", direction=" + direction +
                ", startStopName='" + startStopName + '\'' +
                ", endStopName='" + endStopName + '\'' +
                ", firstTime='" + firstTime + '\'' +
                ", lastTime='" + lastTime + '\'' +
                ", intervalTime='" + intervalTime + '\'' +
                ", price='" + price + '\'' +
                ", stopsNum=" + stopsNum +
                ", measure=" + measure +
                ", beBus='" + beBus + '\'' +
                ", line2Id='" + line2Id + '\'' +
                ", nearBus=" + nearBus +
                ", currentStopId='" + currentStopId + '\'' +
                ", currentStopName='" + currentStopName + '\'' +
                ", currentStopOrder='" + currentStopOrder + '\'' +
                ", nextStopName='" + nextStopName + '\'' +
                '}';
    }
}
