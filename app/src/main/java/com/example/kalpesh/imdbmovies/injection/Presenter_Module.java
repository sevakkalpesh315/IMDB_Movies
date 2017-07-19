package com.example.kalpesh.imdbmovies.injection;

import com.example.kalpesh.imdbmovies.movielist.mvp.interactor.MovieList_InteractorImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kalpesh on 18/07/2017.
 */

@Module
public class Presenter_Module {

    @Provides
    public MovieList_InteractorImpl getInteractor(){
        return new MovieList_InteractorImpl();
    }
}
