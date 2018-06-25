package com.app.mymvp.view;

import com.app.mymvp.bean.Score;

import java.util.List;

/**
 * 视图层接口
 */
public interface IScoreView {

    //加载提示
    void showLoading();

    //显示数据
    void showScores(List<Score> scores);
}
