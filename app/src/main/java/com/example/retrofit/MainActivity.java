package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.retrofit.adapter.NHAdapter;
import com.example.retrofit.adapter.UserAdapter;
import com.example.retrofit.model.Get;
import com.example.retrofit.model.Post;
import com.example.retrofit.retrofit.PolyRetrofit;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static androidx.recyclerview.widget.LinearLayoutManager.*;

public class MainActivity extends AppCompatActivity  implements MainView{
    private SwipeRefreshLayout swipe;
    private RecyclerView recyView;
    private ArrayList<Get> arrayGet;
    private NHAdapter NhAdapter;

    private MainPresenter mainPresenter;

    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
    }

    private void AnhXa() {

        swipe = (SwipeRefreshLayout) findViewById(R.id.swipe);
        recyView = (RecyclerView) findViewById(R.id.recyView);
        arrayGet = new ArrayList<>();
        linearLayoutManager = new LinearLayoutManager(this);
        recyView.setHasFixedSize(true);
        recyView.setLayoutManager(linearLayoutManager);

        mainPresenter=new MainPresenter(this);
        mainPresenter.getData();


        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mainPresenter.postData("Doan","MOB");
                swipe.setRefreshing(false);
            }
        });

    }

    @Override
    public void onSuccess() {
        Toast.makeText(this, "Thanh Cong", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnGetResult(List<Get> gets) {
        arrayGet = (ArrayList<Get>) gets;
        NhAdapter = new NHAdapter((ArrayList<Get>) gets,MainActivity.this);
        NhAdapter.notifyDataSetChanged();
        recyView.setAdapter(NhAdapter);
    }

    @Override
    public void PostResult(String name, String lop) {

    }
}
