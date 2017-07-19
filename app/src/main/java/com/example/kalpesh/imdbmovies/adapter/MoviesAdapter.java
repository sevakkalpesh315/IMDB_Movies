package com.example.kalpesh.imdbmovies.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kalpesh.imdbmovies.R;
import com.example.kalpesh.imdbmovies.movielist.model.MovieListModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> {

    private int rowLayout;
    private Context context;
    MovieListModel response;

    /**
     * 3 Implement interface: this will create two methods click and long click
     */
    public static class MovieViewHolder extends RecyclerView.ViewHolder{ //implements View.OnClickListener, View.OnLongClickListener{
        @BindView(R.id.title)
        TextView movieTitle;

        @BindView(R.id.subtitle)
        TextView data;
        /**
         * 1 Add itemClickListerner Interface
         * 2 Create object
         */
        //private ItemClickListener clickListener;

        @BindView(R.id.description)
        TextView movieDescription;

        @BindView(R.id.rating)
        TextView rating;



        public MovieViewHolder(View v) {
            super(v);

            ButterKnife.bind(this, v);
            itemView.setTag(itemView);

        }
    }

    public MoviesAdapter(MovieListModel response, int rowLayout, Context context) {
        this.response = response;
        this.rowLayout = rowLayout;
        this.context = context;
    }


    @Override
    public MoviesAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new MovieViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MovieViewHolder holder, final int position) {


            //  holder.movieTitle.setText(title);
        holder.movieTitle.setText(response.getResults().get(position).getTitle());
        holder.data.setText(response.getResults().get(position).getReleaseDate());
        holder.movieDescription.setText(response.getResults().get(position).getOverview());
        holder.rating.setText(response.getResults().get(position).getVoteAverage().toString());

    }

    @Override
    public int getItemCount() {
        return response.getResults().size();
    }
}