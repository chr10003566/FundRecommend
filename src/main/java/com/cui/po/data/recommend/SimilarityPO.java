package com.cui.po.data.recommend;

public class SimilarityPO {
    private Integer id;

    private String fundIdFirst;

    private String fundIdSecond;

    private String score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFundIdFirst() {
        return fundIdFirst;
    }

    public void setFundIdFirst(String fundIdFirst) {
        this.fundIdFirst = fundIdFirst == null ? null : fundIdFirst.trim();
    }

    public String getFundIdSecond() {
        return fundIdSecond;
    }

    public void setFundIdSecond(String fundIdSecond) {
        this.fundIdSecond = fundIdSecond == null ? null : fundIdSecond.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }
}