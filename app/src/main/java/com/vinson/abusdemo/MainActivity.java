/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.vinson.abusdemo;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.vinson.abus.core.ServiceApiImpl;
import com.vinson.abus.model.base.BusLine;
import com.vinson.abus.model.BusLineSearchResult;
import com.vinson.abus.model.LineDetailSearchResult;
import com.vinson.bussdk.R;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

    SearchView mSearchView;
    ListView mListView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSearchView = findViewById(R.id.search_view);
        mListView = findViewById(R.id.search_result);
        mSearchView.setIconifiedByDefault(false);

        initView();
        initEvent();
    }

    private void initView() {
        myAdapter = new MyAdapter(this);
        mListView.setAdapter(myAdapter);
    }

    private void initEvent() {
        mSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override public boolean onQueryTextSubmit(String query) {
                Log.d(TAG, "onQueryTextSubmit : " + query);
                return true;
            }

            @Override public boolean onQueryTextChange(String newText) {
                Log.d(TAG, "onQueryTextChange : " + newText);
                ServiceApiImpl.getInstance().getSearchLines(newText).enqueue(new Callback<BusLineSearchResult>() {
                    @Override
                    public void onResponse(Call<BusLineSearchResult> call, Response<BusLineSearchResult>
                            response) {
                        if (response.body() != null) {
                            BusLineSearchResult result = response.body();
                            List<BusLine> busLines = result.getData().getLines();
                            myAdapter.setData(busLines);
                        }
                    }

                    @Override
                    public void onFailure(Call<BusLineSearchResult> call, Throwable t) {
                    }
                });
                return true;
            }
        });
    }


    @Override protected void onResume() {
        super.onResume();
    }
}
