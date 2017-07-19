package com.example.kalpesh.imdbmovies.injection.components;

import com.example.kalpesh.imdbmovies.injection.Netmodule.AppModule;
import com.example.kalpesh.imdbmovies.injection.Netmodule.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by Kalpesh on 20/06/16.
 */
@Singleton
@Component(modules = {NetModule.class, AppModule.class})
public interface NetComponent {
    Retrofit retrofit();
}
