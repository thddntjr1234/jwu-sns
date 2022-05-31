package com.example.jwusns;

import com.example.jwusns.Dto.Post.PostInfoResponseDto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static RetrofitClient instance = null;
    public static RetrofitAPI retrofitAPI;
    private static final String BASE_URL = "http://10.0.2.2:8080/";

//    Retrofit retrofit = new Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build();
    private RetrofitClient(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofitAPI = retrofit.create(RetrofitAPI.class);
    }

    public static RetrofitClient getInstance(){
        if(instance == null) {
            instance = new RetrofitClient();
        }
        return instance;
   }

   public static RetrofitAPI getRetrofitAPI(){
        return retrofitAPI;
   }

}