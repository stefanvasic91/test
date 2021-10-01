package com.easyswitch.test;

import com.easyswitch.test.models.Owner;
import com.easyswitch.test.models.Search;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WebApi {

    String BASE_URL = "https://api.github.com/";
    int TIMEOUT = 30;

    @GET("search/repositories")
    Call<Search> loadRepos(
            @Query("q") String text,
            @Query("sort") String sort,
            @Query("order") String order,
            @Query("per_size") String per_size,
            @Query("page") String page
    );


    @GET("users/{login}")
    Call<Owner> getUSer(
            @Path("login") String login
    );
}
