package com.example.kalpesh.imdbmovies.movielist;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kalpesh.imdbmovies.MyMoviesApp;
import com.example.kalpesh.imdbmovies.R;
import com.example.kalpesh.imdbmovies.adapter.MoviesAdapter;
import com.example.kalpesh.imdbmovies.injection.components.APIComponent;
import com.example.kalpesh.imdbmovies.movielist.model.MovieListModel;
import com.example.kalpesh.imdbmovies.movielist.mvp.IMovieListView;
import com.example.kalpesh.imdbmovies.movielist.mvp.Presenter_MovieList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class MovieListFragment extends Fragment implements IMovieListView {
   // private Presenter_MovieList presenter_movieList;
   // private MovieList_InteractorImpl movieList_interactor;

    @Inject
    Presenter_MovieList presenter_movieList;

    /**
     * Using Butterknife for view injection
     */
    @BindView(R.id.movies_recycler_view)
    RecyclerView recyclerView;

    @Override
    public void onFetchDataStarted() {

    }

    @Override
    public void onFetchDataError(Throwable e) {

    }

    @Override
    public void onFetchDataCompleted() {

    }

    @Override
    public void onFetchDataSucess(MovieListModel movieListModel) {
        Log.i("Movies" , movieListModel.getResults().get(1).getTitle());
        recyclerView.setAdapter(new MoviesAdapter(movieListModel, R.layout.list_item_movie, getActivity().getApplicationContext()));

    }


    public MovieListFragment() {
        // Required empty public constructor
    }

    public static MovieListFragment  createFragment(){
        return new MovieListFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        setRetainInstance(true);
        InitilizeDagger();
        setInjections();
        // Inflate the layout for this fragment
       // Toast.makeText(getActivity().getApplicationContext(),"LayoutInflater", Toast.LENGTH_LONG).show();
        //TODO: Remove the object initialization - Introduce Dagger2
      //  movieList_interactor= new MovieList_InteractorImpl();
       // presenter_movieList= new Presenter_MovieList(movieList_interactor);


        presenter_movieList.attachView(this);

        View view= inflater.inflate(R.layout.fragment_movie_list, container, false);
        ButterKnife.bind(this, view);

        return view;

    }

    public void InitilizeDagger(){
        ((MyMoviesApp)getActivity().getApplication()).getiPresenterComponent().inject(this);
    }

    @Inject
    public void setPresenter_movieList(Presenter_MovieList presenter_movieList){
        this.presenter_movieList= presenter_movieList;
    }


    private void setInjections() {
        APIComponent apiComponent = ((MyMoviesApp)getActivity().getApplication()).getApiComponent();
        presenter_movieList.injectForData(apiComponent);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
            presenter_movieList.attachView(this);

        presenter_movieList.performListSearch();
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        presenter_movieList.detachView();
    }
}
