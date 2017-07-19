package com.example.kalpesh.imdbmovies.movielist.mvp;

import com.example.kalpesh.imdbmovies.movielist.model.MovieListModel;

/**
 * Created by kalpesh on 13/07/2017.
 */

public interface IMovieListView extends MvpView{

    void onFetchDataStarted();
    void onFetchDataError(Throwable e);
    void onFetchDataCompleted();
    void onFetchDataSucess(MovieListModel movieListModel);

}
