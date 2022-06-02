package com.example.jwusns;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.jwusns.Dto.Post.PostInfoResponseDto;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AfterLoginMainActivity extends AppCompatActivity implements View.OnClickListener {
    private PostInfoResponseDto postInfoData;
    private PostInfoResponseDto result;
    private RetrofitAPI retrofitAPI;

    private fragment_postlist postFragment;

    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;

    private static String Token = "Bearer " +
            "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBY2Nlc3NUb2" +
            "tlbiIsImV4cCI6MTY1MzkzNDQwMiwidXNlcm5hbWUiOiJ3b29zZW9rMjIyIn0.yQOOF4D5rU3Jf9i7jn2GAYm6rPTSrG8rMIGO0wdvuTbRoFy9ruE17T2sAIdqNsk5VHA-wfHIz5ob0okyY9n5bg";
    private Long page = 0L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login_main);

        fragmentManager = getSupportFragmentManager();

        postFragment = new fragment_postlist();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, postFragment).commitAllowingStateLoss();
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.navigation_home:
                transaction.replace(R.id.frameLayout, postFragment).commitAllowingStateLoss();
                break;
            case R.id.navigation_profile:
                break;
        }
    }

    public PostInfoResponseDto getPostInfoData() {
        if (postInfoData == null){ //다른 activity에서 getPostInfoData를 호출하면 postInfoData가 null인지 확인하고 retrofit 호출
            loadPostList(); // loadPostList 출력해서
        }
        return postInfoData;
    }

    private void loadPostList() {
        RetrofitClient retrofitClient = RetrofitClient.getInstance();

        if (retrofitClient != null) {
            retrofitAPI = RetrofitClient.getRetrofitAPI();
            retrofitAPI.getPostList(Token, page).enqueue(new Callback<PostInfoResponseDto>() {
                @Override
                public void onResponse(Call<PostInfoResponseDto> call, Response<PostInfoResponseDto> response) {
                    postInfoData = response.body();
                    if (postInfoData != null) {
                        Log.e("model", "Success");
                    }
                    else
                        Log.e("model", "성공했는데 데이터를 못받아옴");
                }

                @Override
                public void onFailure(Call<PostInfoResponseDto> call, Throwable t) {
                    Log.e("model", "failed");
                }
            });
        }
    }
}