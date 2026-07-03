package com.coforge.d3;

public class MovieApp {

    public static void main(String[] args) {

        Movie mov = new Movie();

        mov.setMovieName("Inception");
        mov.setDirector("Christopher Nolan");
        mov.setRating(9.2);

        System.out.println(mov);
    }
}