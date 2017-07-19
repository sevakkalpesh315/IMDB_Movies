package com.example.kalpesh.imdbmovies.injection;

import com.example.kalpesh.imdbmovies.movielist.MovieListFragment;

import dagger.Component;

/**
 * Created by kalpesh on 18/07/2017.
 */

@PerActivity
@Component(dependencies = {Presenter_Module.class})
public interface IPresenterComponent {

    void inject(MovieListFragment movieListFragment);

}
