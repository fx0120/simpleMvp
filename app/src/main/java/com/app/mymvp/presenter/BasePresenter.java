package com.app.mymvp.presenter;

import java.lang.ref.WeakReference;

/**
 * Created by Administrator on 2018\6\22 0022.
 */

public class BasePresenter<T> {

    //view引用
    protected WeakReference<T> mViewRef;

    public void attackView(T view){
        mViewRef=new WeakReference<T>(view);
    }

    public void detachView(){
        if(mViewRef != null){
            mViewRef.clear();
        }
    }

    protected  T getView(){
        return  mViewRef.get();
    }

}
