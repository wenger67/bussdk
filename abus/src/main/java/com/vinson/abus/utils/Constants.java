package com.vinson.abus.utils;

/**
 * project:bussdk
 * email: zhanwit@163.com
 * time: 2019/1/9 16:55
 * author: Vinson. Zhan
 * comment: ${DESCRIPTION}
 */

public class Constants {

    public static final String BASE_SERVER = "http://bus.wuhancloud.cn:9087/website/web/420100/";
    private static final String END_STR = ".do";
    private static final String SPLITE = "/";

    // query bus line http://bus.wuhancloud.cn:9087/website//web/420100/search
    // .do?keyword=5&type=line
    public static String getSearchLinesUrl(String keyword) {
        return BASE_SERVER + "search.do?keyword=" + keyword + "&type=line";
    }

    // line details http://bus.wuhancloud.cn:9087/website//web/420100/line/536/1.do
    public static String getLineDetailByLineNo(String lineNo, int direction) {
        return BASE_SERVER + "line/" + lineNo + SPLITE + direction + END_STR;
    }

    // line detail by line id http://bus.wuhancloud.cn:9087/website//web/420100/line/027-536-1.do
    public static String getLineDetailByLineId(String lineId) {
        return BASE_SERVER + "line/" + lineId + END_STR;
    }

    // get nearby lines http://bus.wuhancloud
    // .cn:9087/website/web/420100/nearby/lines/114.40752450436713/30.50416123658858.do
    public static String getNearbyLines(double longitude, double latitude) {
        return BASE_SERVER + "nearby/lines/" + longitude + SPLITE + latitude + END_STR;
    }

    // get stop name http://bus.wuhancloud.cn:9087/website//web/420100/search
    // .do?keyword=%E4%B8%8A%E8%A1%97%E6%9D%91&type=stop
    public static String getStopIdByName(String stopName) {
        return BASE_SERVER + "search.do?keyword=" + stopName + "&type=stop";
    }

    // get stop group http://bus.wuhancloud.cn:9087/website//web/420100/stop/group/027-1237.do
    public static String getStopGroupByStopId(String stopId) {
        return BASE_SERVER + "stop/group/" + stopId + END_STR;
    }

}
