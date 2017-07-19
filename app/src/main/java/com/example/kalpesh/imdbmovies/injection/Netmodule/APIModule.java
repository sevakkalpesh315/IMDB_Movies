package com.example.kalpesh.imdbmovies.injection.Netmodule;

import com.example.kalpesh.imdbmovies.injection.PerActivity;
import com.example.kalpesh.imdbmovies.movielist.service.RequestInterface;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Kalpesh on 20/06/16.
 */
@Module
public class APIModule {
    @PerActivity
    @Provides
    RequestInterface provideMovieAPI(Retrofit retrofit) {
        return retrofit.create(RequestInterface.class);
    }
}
