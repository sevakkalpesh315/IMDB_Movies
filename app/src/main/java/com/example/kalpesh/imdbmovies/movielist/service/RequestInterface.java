package com.example.kalpesh.imdbmovies.movielist.service;

import com.example.kalpesh.imdbmovies.movielist.model.MovieListModel;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by kalpesh on 13/07/2017.
 */

public interface RequestInterface {

    @GET("movie/top_rated")
    Observable<MovieListModel> getMoviesList(@Query("api_key") String apikey);



}
