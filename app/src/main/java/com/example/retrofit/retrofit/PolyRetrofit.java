package com.example.retrofit.retrofit;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class PolyRetrofit {

    public static PolyService polyService;


    public static PolyService getInstance(){

        if (polyService == null){
            Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("http://192.168.1.43")
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

             polyService = retrofit.create(PolyService.class);
        }
        return polyService;
    }
}
