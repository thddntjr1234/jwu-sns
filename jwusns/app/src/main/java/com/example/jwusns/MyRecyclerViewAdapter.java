package com.example.jwusns;

import android.content.Context;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jwusns.Dto.Post.BriefPostInfo;

import java.util.ArrayList;
import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    ArrayList<BriefPostInfo> items = new ArrayList<BriefPostInfo>();

    //뷰홀더 객체 선언, item_summarized_post에 데이터를 담기 위한 dto 역할
    public class ViewHolder extends RecyclerView.ViewHolder {
        protected TextView title;
        protected TextView content;
        protected TextView writetime;
        protected TextView writer;


        public ViewHolder(View view) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.item_post_title); // 변수별로 textview id 할당
            this.content = (TextView) view.findViewById(R.id.item_post_content);
            this.writetime = (TextView) view.findViewById(R.id.item_post_time);
            this.writer = (TextView) view.findViewById(R.id.item_post_nickname);
        }
    }


    public MyRecyclerViewAdapter(ArrayList<BriefPostInfo> list) {
        this.items = list;
    }

    // ViewHolder 객체를 생성하고 초기화함
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_summarized_post, viewGroup, false); // 사용할 item 레이아웃을 지정해줌 여기는 포스트 요약 레이아웃 적용

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    // 데이터를 가져와서 ViewHolder안의 내용을 채워줌
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewholder, int position) {

        viewholder.title.setText(items.get(position).getTitle());
        viewholder.content.setText(items.get(position).getContent());
        viewholder.writer.setText(items.get(position).getWriterName());
        viewholder.writetime.setText(items.get(position).getCreatedDate());
    }

    @Override
    public int getItemCount() {
        return (null != items ? items.size() : 0);
    }
}
