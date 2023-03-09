package com.example.flixster1

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.flixster1.R.id

class RecyclerViewAdapter (
    private val movies : List<Movie>,
    private val mListener: OnListFragmentInteractionListener?
    ) : RecyclerView.Adapter<RecyclerViewAdapter.MovieViewHolder>()
    {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder{
            val view = LayoutInflater.from(parent.context).inflate(
                R.layout.fragment_movie, parent, false
            )
            return MovieViewHolder(view)
        }

    inner class MovieViewHolder(val mView: View) :RecyclerView.ViewHolder(mView){
        var mItems : Movie? = null
        val mMovieTitle = mView.findViewById<View>(id.movie_name) as TextView
        val mMovieDescription =mView.findViewById<View>(id.description) as TextView
        val mMovieImage: ImageView = mView.findViewById<View>(id.movie_image) as ImageView

        override fun toString(): String {
            return mMovieTitle.toString() + " '" + mMovieDescription.text + "'"
        }
    }

        override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
            val movie = movies[position]
            holder.mMovieTitle.text = movie.title
            holder.mMovieDescription.text = movie.overview
            var imageUrl = "https://image.tmdb.org/t/p/w500/" + movie.posterUri
            Log.d("image url", imageUrl)
            Glide.with(holder.mView)
                .load(imageUrl)
                .placeholder(R.drawable.flixster_icon)
                .centerInside()
                .into(holder.mMovieImage)
        }

        override fun getItemCount(): Int {
            return movies.size
        }
    }