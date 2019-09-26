package com.example.retrofit;

import com.example.retrofit.model.Get;

import java.util.List;

public interface MainView {
    void onSuccess();
    void onFailure(String error);
    void OnGetResult(List<Get> gets);
    void PostResult(String name, String lop);
}
