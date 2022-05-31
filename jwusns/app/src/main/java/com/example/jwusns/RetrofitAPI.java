package com.example.jwusns;

import com.example.jwusns.Dto.Post.PostInfoResponseDto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface RetrofitAPI {
    @GET("post")
    Call<PostInfoResponseDto> getPostList(@Header("Authorization") String token, @Query("page") Long page);

}

