package com.app.mymvp.bean;

/**
 * Created by Administrator on 2018\6\22 0022.
 */

public class Score {

    private String star;
    private String title;

    public Score(String star, String title) {
        this.star = star;
        this.title = title;
    }


    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
