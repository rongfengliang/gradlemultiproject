package com.dalong.moviesservice;

/**
 * @author dalong
 */
public class Movies {
    private String moviesId;
    private int    moviesIndexId;

    public Movies() {
    }

    public Movies(String moviesId, int moviesIndexId) {
        this.moviesId = moviesId;
        this.moviesIndexId = moviesIndexId;
    }

    public String getMoviesId() {
        return moviesId;
    }

    public void setMoviesId(String moviesId) {
        this.moviesId = moviesId;
    }

    public int getMoviesIndexId() {
        return moviesIndexId;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "moviesId='" + moviesId + '\'' +
                ", moviesIndexId=" + moviesIndexId +
                '}';
    }

    public void setMoviesIndexId(int moviesIndexId) {
        this.moviesIndexId = moviesIndexId;
    }
}
