package com.example.kalpesh.imdbmovies.movielist.mvp.interactor;

import com.example.kalpesh.imdbmovies.injection.components.APIComponent;
import com.example.kalpesh.imdbmovies.movielist.model.MovieListModel;
import com.example.kalpesh.imdbmovies.movielist.service.RequestInterface;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by kalpesh on 13/07/2017.
 */

public class MovieList_InteractorImpl implements IMovieList_Interactor {
@Inject
RequestInterface requestInterface;

    public MovieList_InteractorImpl() {

//        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
//        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
//
//        okHttpClient= new OkHttpClient.Builder().
//                addInterceptor(httpLoggingInterceptor).build();
//
//        retrofit= new Retrofit.Builder()
//                .baseUrl(Constants.BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .client(okHttpClient)
//                .build();
//
//        requestInterface= retrofit.create(RequestInterface.class);

    }

    /**
     * The Dagger graph injection is performed in the method.
     * @param apiComponent
     */
    @Override
    public void initiateInjectionGraph(APIComponent apiComponent) {
        apiComponent.inject(this);
    }

    @Override
    public Observable<MovieListModel> getMoviesSearch(String ApiKey) {
        return requestInterface.getMoviesList(ApiKey);
    }
}
