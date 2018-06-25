package com.app.mymvp.presenter;

import com.app.mymvp.bean.Score;
import com.app.mymvp.model.ScoreModelImpl;
import com.app.mymvp.model.IScoreModel;
import com.app.mymvp.view.IScoreView;

import java.util.List;

/**
 * Created by Administrator on 2018\6\22 0022.
 */

public class ScorePresenterv3 extends BasePresenter<IScoreView>{

    //Model引用
    IScoreModel girlModel=new ScoreModelImpl();

    public void fetch(){
        //显示进度条
        if(girlModel !=null){
            if(getView() != null){
                getView().showLoading();
            }

            girlModel.loadGril(new IScoreModel.ScoreOnloadListener() {
                @Override
                public void onComplete(List<Score> scores) {
                    //返回数据
                    //显示在View层
                    IScoreView girlView=getView();
                    if(girlView != null){
                        getView().showScores(scores);
                    }
                }
            });
        }
    }
}
