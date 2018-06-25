package com.app.mymvp.model;

import com.app.mymvp.bean.Score;

import java.util.List;

/**
 * Created by Administrator on 2018\6\22 0022.
 */

public interface IScoreModel {

    void loadGril(ScoreOnloadListener listener);

    //接口设计:回调返回数据
    interface  ScoreOnloadListener{
        void onComplete(List<Score> scores);
    }

}
