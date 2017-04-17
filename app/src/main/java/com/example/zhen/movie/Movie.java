package com.example.zhen.movie;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by Zhen on 2017/4/14.
 */

public class Movie implements Parcelable {

    private String title;
    private String poster_path;
    private String overview;
    private String backdrop_path;

    public Movie() {}

    protected Movie(Parcel in) {
        title = in.readString();
        poster_path = in.readString();
        overview = in.readString();
        backdrop_path = in.readString();
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster() {
        return "http://image.tmdb.org/t/p/w500" + poster_path;
    }

    public void setPoster(String poster) {
        this.poster_path = poster;
    }

    public String getDescription() {
        return overview;
    }

    public void setDescription(String description) {
        this.overview = description;
    }

    public String getBackdrop() {
        return "http://image.tmdb.org/t/p/w500"  + backdrop_path;
    }

    public void setBackdrop(String backdrop) {
        this.backdrop_path = backdrop;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(poster_path);
        parcel.writeString(overview);
        parcel.writeString(backdrop_path);
    }

    public static class MovieResult {
        private List<Movie> results;

        public List<Movie> getResults() {
            return results;
        }
    }
}
