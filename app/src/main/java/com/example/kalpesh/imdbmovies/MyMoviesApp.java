package com.example.kalpesh.imdbmovies;

import android.app.Application;

import com.example.kalpesh.imdbmovies.injection.DaggerIPresenterComponent;
import com.example.kalpesh.imdbmovies.injection.IPresenterComponent;
import com.example.kalpesh.imdbmovies.injection.Netmodule.APIModule;
import com.example.kalpesh.imdbmovies.injection.Netmodule.AppModule;
import com.example.kalpesh.imdbmovies.injection.Netmodule.NetModule;
import com.example.kalpesh.imdbmovies.injection.components.APIComponent;
import com.example.kalpesh.imdbmovies.injection.components.DaggerAPIComponent;
import com.example.kalpesh.imdbmovies.injection.components.DaggerNetComponent;
import com.example.kalpesh.imdbmovies.injection.components.NetComponent;
import com.example.kalpesh.imdbmovies.movielist.model.Constants;

/**
 * Created by kalpesh on 18/07/2017.
 */

public class MyMoviesApp extends Application {

    IPresenterComponent iPresenterComponent;
    NetComponent netComponent;
APIComponent apiComponent;
    public IPresenterComponent getiPresenterComponent() {
        return iPresenterComponent;
    }

    public NetComponent getNetComponent() {
        return netComponent;
    }

    public APIComponent getApiComponent() {
        return apiComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        iPresenterComponent= DaggerIPresenterComponent.create();
        netComponent= DaggerNetComponent.builder()
                .netModule(new NetModule(Constants.BASE_URL))
                .appModule(new AppModule(this))
                .build();

        apiComponent= DaggerAPIComponent.builder()
                .netComponent(netComponent)
                .aPIModule(new APIModule())
                .build();


    }
}
