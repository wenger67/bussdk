package com.vinson.bussdk;

import android.os.Bundle;
import android.util.Log;

import com.vinson.abus.core.ServiceApiImpl;
import com.vinson.abus.model.base.BusLine;
import com.vinson.abus.model.BusLineSearchResult;
import com.vinson.abus.model.LineDetailSearchResult;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override protected void onResume() {
        super.onResume();
        ServiceApiImpl.getInstance().getSearchLines("53").enqueue(new Callback<BusLineSearchResult>() {
            @Override
            public void onResponse(Call<BusLineSearchResult> call, Response<BusLineSearchResult>
                    response) {
                if (response.body() != null) {
                    BusLineSearchResult result = response.body();
                    Log.d(TAG, result.getResultCode() + ", " + result.getResultDes());
                    List<BusLine> busLines = result.getData().getLines();
                    for (BusLine b : busLines) {
                        Log.d(TAG, b.toString());
                    }
                }
            }

            @Override
            public void onFailure(Call<BusLineSearchResult> call, Throwable t) {
            }
        });

        ServiceApiImpl.getInstance().getLineDetailByLineNo("536", 0).enqueue(new Callback<LineDetailSearchResult>() {



            @Override public void onResponse(Call<LineDetailSearchResult> call, Response<LineDetailSearchResult> response) {
                if (response.body() != null) {
                    Log.d(TAG, response.body().getData().toString());
                }
            }

            @Override public void onFailure(Call<LineDetailSearchResult> call, Throwable t) {

            }
        });


    }
}
