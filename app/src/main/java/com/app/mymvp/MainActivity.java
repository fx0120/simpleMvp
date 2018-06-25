package com.app.mymvp;

import android.os.Bundle;
import android.widget.Toast;

import com.app.mymvp.bean.Score;
import com.app.mymvp.presenter.ScorePresenterv3;
import com.app.mymvp.view.IScoreView;

import java.util.List;

public class MainActivity extends BaseActivity<IScoreView,ScorePresenterv3> implements IScoreView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        girPresenter.fetch();
    }

    @Override
    protected ScorePresenterv3 createPresenter() {
        return new ScorePresenterv3();
    }

    @Override
    public void showLoading() {
        Toast.makeText(this,"正在加载中",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showScores(List<Score> scores) {
        System.out.println("----数据长度---->"+scores.size());
    }
}
