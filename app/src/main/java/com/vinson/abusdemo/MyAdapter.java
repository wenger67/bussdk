/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.vinson.abusdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.vinson.abus.model.base.BusLine;
import com.vinson.bussdk.R;

import java.util.ArrayList;
import java.util.List;

/**
 * project:bussdk
 * email: zhanwit@163.com
 * time: 2019/1/15 14:53
 * author: Vinson. Zhan
 * comment: ${DESCRIPTION}
 */
public class MyAdapter extends BaseAdapter {

    private List<BusLine> mData = new ArrayList<>();
    private Context mContext;

    public MyAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override public int getCount() {
        return mData.size();
    }

    public void setData(List<BusLine> data) {
        this.mData = data;
        notifyDataSetChanged();
    }

    @Override public BusLine getItem(int position) {
        return mData.get(position);
    }

    @Override public long getItemId(int position) {
        return position;
    }

    @Override public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_search_result, parent, false);
        TextView textView = view.findViewById(R.id.txt);
        BusLine busLine = getItem(position);
        textView.setText(busLine.getLineNo() + " " + busLine.getStartStopName() + " " + busLine.getEndStopName());
        return view;
    }

}
