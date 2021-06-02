package ru.netology.manager;

import lombok.Data;
import ru.netology.domain.Movie;

@Data
public class AfficheManager {
    private Movie[] movies = new Movie[0];
    private int movieAmount = 10;

    public AfficheManager() {

    }

    public AfficheManager(int movieAmount) {
        this.movieAmount = movieAmount;

    }


    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] getAll() {
        // сперва пишу логику для результирующего массива-ответа
        int resultLength;
        if (movies.length > movieAmount) {
            resultLength = movieAmount;
        } else {
            resultLength = movies.length;
        }


        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            if (movies.length > movieAmount) {
                int index = resultLength - i - 1 + (movies.length - movieAmount);
                result[i] = movies[index];
            } else {
                int index = resultLength - i - 1;
                result[i] = movies[index];
            }
        }
        return result;

    }
}
