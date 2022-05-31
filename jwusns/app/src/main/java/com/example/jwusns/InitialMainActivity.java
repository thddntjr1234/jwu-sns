package com.example.jwusns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jwusns.Dto.Post.BriefPostInfo;
import com.example.jwusns.Dto.Post.PostInfoResponseDto;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InitialMainActivity extends AppCompatActivity {

    Button btn_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_main);
        this.initializeView();
        this.SetListener();
    }

    public void initializeView(){
        btn_test = (Button)findViewById(R.id.button1);
    }

    public void SetListener(){
        View.OnClickListener Listener = new View.OnClickListener(){
           @Override
           public void onClick(View view){
               switch (view.getId()) {
                   case R.id.button1:
                       Intent intent = new Intent(InitialMainActivity.this, AfterLoginMainActivity.class);
                       startActivity(intent);
               }
           }
        };
        btn_test.setOnClickListener(Listener);
    }
}