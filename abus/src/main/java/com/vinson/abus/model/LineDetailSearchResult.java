/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.vinson.abus.model;

import com.vinson.abus.model.base.BusStatus;
import com.vinson.abus.model.base.StopStation;

import java.util.ArrayList;
import java.util.List;

/**
 * project:bussdk
 * email: zhanwit@163.com
 * time: 2019/1/14 14:22
 * author: Vinson. Zhan
 * comment: ${DESCRIPTION}
 */
public class LineDetailSearchResult {
    private String resultCode;
    private String resultDes;
    private Data data;

    public String getResultCode() {
        return resultCode;
    }

    public String getResultDes() {
        return resultDes;
    }

    public Data getData() {
        return data;
    }

    public class Data {
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
        private String stopsNum;
        private String measure;
        private String beBus;
        private String line2Id;
        List<StopStation> stops;
        List<String> buses;
        List<BusStatus> busStatuses;

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

        public String getStopsNum() {
            return stopsNum;
        }

        public String getMeasure() {
            return measure;
        }

        public String getBeBus() {
            return beBus;
        }

        public String getLine2Id() {
            return line2Id;
        }

        public List<StopStation> getStops() {
            return stops;
        }

        public List<BusStatus> getBusStatuses() {
            busStatuses = new ArrayList<>();
            if (buses != null && buses.size() > 0) {
                for (String str : buses) {
                    BusStatus busStatus = new BusStatus(str);
                    busStatuses.add(busStatus);
                }
            }
            return busStatuses;
        }

        @Override public String toString() {
            return "Data{" +
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
                    ", stopsNum='" + stopsNum + '\'' +
                    ", measure='" + measure + '\'' +
                    ", beBus='" + beBus + '\'' +
                    ", line2Id='" + line2Id + '\'' +
                    ", buses='" + getBusStatuses().size() + '\'' +
                    '}';
        }
    }

}
