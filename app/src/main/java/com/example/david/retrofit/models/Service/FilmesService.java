package com.example.david.retrofit.models.Service;

import com.example.david.retrofit.models.MyPojo;
import com.example.david.retrofit.models.Results;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FilmesService {

    @GET("4sblo")
    Call<MyPojo> listCatalogo();
}
