package com.example.jwusns.Dto.Post;

import com.example.jwusns.Dto.Post.BriefPostInfo;

import java.util.ArrayList;
import java.util.List;

public class PostInfoResponseDto {
    private int totalPageCount;//총 몇페이지가 존재하는지
    private int currentPageNum;//현재 몇 페이지인지
    private long totalElementCount; //존재하는 게시글의 총 개수
    private int currentPageElementCount; //현재 페이지에 존재하는 게시글 수
    private List<BriefPostInfo> simpleLectureDtoList = new ArrayList<>();

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public int getCurrentPageNum() {
        return currentPageNum;
    }

    public long getTotalElementCount() {
        return totalElementCount;
    }

    public int getCurrentPageElementCount() {
        return currentPageElementCount;
    }

    public List<BriefPostInfo> getSimpleLectureDtoList() {
        return simpleLectureDtoList;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public void setCurrentPageNum(int currentPageNum) {
        this.currentPageNum = currentPageNum;
    }

    public void setTotalElementCount(long totalElementCount) {
        this.totalElementCount = totalElementCount;
    }

    public void setCurrentPageElementCount(int currentPageElementCount) {
        this.currentPageElementCount = currentPageElementCount;
    }

    public void setSimpleLectureDtoList(List<BriefPostInfo> simpleLectureDtoList) {
        this.simpleLectureDtoList = simpleLectureDtoList;
    }

    @Override
    public String toString() {
        return "PostInfoDto{" +
                "totalPageCount=" + totalPageCount +
                ", currentPageNum=" + currentPageNum +
                ", totalElementCount=" + totalElementCount +
                ", currentPageElementCount=" + currentPageElementCount +
                ", simpleLectureDtoList=" + simpleLectureDtoList +
                '}';
    }
}
