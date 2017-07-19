package com.example.kalpesh.imdbmovies.movielist.mvp;

/**
 * Created by kalpesh on 30/05/2017.
 */


public interface MvpPresenter<V extends MvpView> {

        void attachView(V mvpView);

        void detachView();
    }

