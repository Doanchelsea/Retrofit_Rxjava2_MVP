package com.example.retrofit;

import com.example.retrofit.model.Get;
import com.example.retrofit.model.Post;
import com.example.retrofit.retrofit.PolyRetrofit;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class MainPresenter {
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
    }

    public  void getData(){
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        compositeDisposable.add(PolyRetrofit.getInstance().getNhaHang()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::handleResponse2, this::handleErrorError));
    }

    public void  postData(String name, String lop){

        CompositeDisposable compositeDisposable = new CompositeDisposable();
        compositeDisposable.add(PolyRetrofit.getInstance()
                .postUser(name,lop,"","","")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::handleResponse1, this::handleErrorError));
    }

    private void handleResponse1(List<Post> posts) {
        mainView.onSuccess();
    }

    private void handleErrorError(Throwable throwable) {
        mainView.onFailure("That Bai");
    }

    private void handleResponse2(List<Get> gets) {
        mainView.OnGetResult(gets);
        mainView.onSuccess();
    }
}
