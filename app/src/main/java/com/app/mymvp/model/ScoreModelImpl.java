package com.app.mymvp.model;

import com.app.mymvp.bean.Score;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018\6\22 0022.
 */

public class ScoreModelImpl implements IScoreModel {

    @Override
    public void loadGril(ScoreOnloadListener listener) {
        //加载数据
        List<Score> data=new ArrayList<>();
        data.add(new Score("三颗星","标题一"));
        data.add(new Score("三颗星","标题二"));
        data.add(new Score("三颗星","标题三"));
        data.add(new Score("三颗星","标题四"));
        data.add(new Score("三颗星","标题五"));
        data.add(new Score("三颗星","标题六"));
        data.add(new Score("三颗星","标题七"));
        data.add(new Score("三颗星","标题八"));

        //返回数据
        listener.onComplete(data);
    }
}
