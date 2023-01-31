package com.example.tvgridviewhorizontal;

public class MovieModel {
   int moviePoster;
   String movieName;

   public MovieModel(){

   };

//    public MovieModel(int moviePoster, String movieName) {
//        this.moviePoster = moviePoster;
//        this.movieName = movieName;
//    }

    public int getMoviePoster() {
        return moviePoster;
    }

    public void setMoviePoster(int moviePoster) {
        this.moviePoster = moviePoster;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
