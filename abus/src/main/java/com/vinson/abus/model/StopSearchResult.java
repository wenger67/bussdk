/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.vinson.abus.model;

import com.vinson.abus.model.base.BusLine;
import com.vinson.abus.model.base.StopStation;

import java.util.List;

/**
 * project:bussdk
 * email: zhanwit@163.com
 * time: 2019/1/14 15:21
 * author: Vinson. Zhan
 * comment: ${DESCRIPTION}
 */
public class StopSearchResult {
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
        List<StopStation> stops;
        List<BusLine> lines;

        public List<StopStation> getStops() {
            return stops;
        }

        public List<BusLine> getLines() {
            return lines;
        }
    }
}
