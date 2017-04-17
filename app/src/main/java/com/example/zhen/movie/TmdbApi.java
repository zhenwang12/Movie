package com.example.zhen.movie;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Zhen on 2017/4/14.
 */

public interface TmdbApi {
    @GET("/movie/now_playing")
    void getNowPlaying(Callback<Movie.MovieResult> cb);
    @GET("/movie/upcoming")
    void getUpComing(Callback<Movie.MovieResult> cb);
    @GET("/movie/top_rated")
    void getTopRated(Callback<Movie.MovieResult> cb);
}
