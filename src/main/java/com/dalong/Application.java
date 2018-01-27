package com.dalong;

import com.dalong.moviesservice.Movies;
import com.dalong.userservice.User;

/**
 * @author dalong
 * this is main starter
 */
public class Application {
    public static void main(String[] args){

        User user =new User("dalng",5);
        Movies movies =new Movies("firstmovie",444);
        System.out.println(user.toString());
        System.out.println(movies.toString());

    }
}
