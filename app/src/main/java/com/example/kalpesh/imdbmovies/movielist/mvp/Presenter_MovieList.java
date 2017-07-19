package com.example.kalpesh.imdbmovies.movielist.mvp;

import android.util.Log;

import com.example.kalpesh.imdbmovies.injection.components.APIComponent;
import com.example.kalpesh.imdbmovies.movielist.model.Constants;
import com.example.kalpesh.imdbmovies.movielist.model.MovieListModel;
import com.example.kalpesh.imdbmovies.movielist.mvp.interactor.MovieList_InteractorImpl;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by kalpesh on 13/07/2017.
 */

public class Presenter_MovieList extends BasePresenter<IMovieListView>implements IMovieList_Presenter {

// extends BasePresenter<IMovieListView>

    MovieList_InteractorImpl movieList_interactor;

    @Inject
    public Presenter_MovieList(MovieList_InteractorImpl movieList_interactor) {
        this.movieList_interactor = movieList_interactor;

    }

    @Override
    public void attachView(IMovieListView mvpView) {
        super.attachView(mvpView);
    }

    public void injectForData(APIComponent apiComponent) {
        movieList_interactor.initiateInjectionGraph(apiComponent);
    }


    @Override
    public void performListSearch() {

checkViewAttached();
        movieList_interactor.getMoviesSearch(Constants.API_KEY)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(this:: onSuccess, this:: onError);

    }

    private void onError(Throwable throwable) {
        Log.i("onError",""+throwable.getMessage().toString());

    }

    private void onSuccess(MovieListModel movieListModel) {
        getView().onFetchDataSucess(movieListModel);
Log.i("Movies" , movieListModel.getResults().get(1).getTitle());

    }

    @Override
    public void detachView() {
        super.detachView();
       // if (mSubscription != null) mSubscription.unsubscribe();
    }
}
