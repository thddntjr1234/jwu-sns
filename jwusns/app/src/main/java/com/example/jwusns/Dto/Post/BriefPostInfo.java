package com.example.jwusns.Dto.Post;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BriefPostInfo {
    private Long postId;
    private String title;//제목
    private String content;//내용
    private String writerName;//작성자의 이름
    private String createdDate; //작성일

    public Long getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriterName() {
        return writerName;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "BriefPostInfo{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writerName='" + writerName + '\'' +
                ", createdDate='" + createdDate + '\'' +
                '}';
    }
}
