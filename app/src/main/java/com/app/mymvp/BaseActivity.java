package com.app.mymvp;

import android.app.Activity;
import android.os.Bundle;

import com.app.mymvp.presenter.BasePresenter;

/**
 * Created by Administrator on 2018\6\22 0022.
 */

public abstract class BaseActivity<V,T extends BasePresenter<V>> extends Activity{

   public T girPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        girPresenter = createPresenter();
        girPresenter.attackView((V)this);
    }

    protected  abstract  T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        girPresenter.detachView();
    }
}
