package com.example.kalpesh.imdbmovies.injection.components;

import com.example.kalpesh.imdbmovies.injection.Netmodule.APIModule;
import com.example.kalpesh.imdbmovies.injection.PerActivity;
import com.example.kalpesh.imdbmovies.movielist.mvp.interactor.MovieList_InteractorImpl;

import dagger.Component;

/**
 * Created by Kalpesh on 20/06/16.
 */
@PerActivity
@Component(dependencies = NetComponent.class, modules = APIModule.class)
public interface APIComponent {
    void inject(MovieList_InteractorImpl movieList_interactor);
}
