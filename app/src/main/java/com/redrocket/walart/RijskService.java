package com.redrocket.walart;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RijskService {
    @GET("users/{user}/repos")
    Call<List<Object>> listRepos(@Path("user") String user);
}
