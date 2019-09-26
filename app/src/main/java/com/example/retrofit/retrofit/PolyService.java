package com.example.retrofit.retrofit;

import com.example.retrofit.model.Get;
import com.example.retrofit.model.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PolyService {

    @FormUrlEncoded
    @POST("/datban/dangky.php")
    Observable<List<Post>> postUser (@Field("taikhoan") String taikhoan,
                                     @Field("matkhau") String matkhau,
                                     @Field("email") String email,
                                     @Field("hoten") String hoten,
                                     @Field("imageok") String imageok);

    @GET("/datban/dangnhap.php")
    Observable<List<Post>> getUser ();

    @GET("/datban/bangtin.php")
    Observable<List<Get>> getNhaHang ();
}
