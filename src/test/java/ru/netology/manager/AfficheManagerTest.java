package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class AfficheManagerTest {
    AfficheManager manager = new AfficheManager(4);

    @Test
    public void shouldShowThreeMovies() {
        Movie first = new Movie(1, 1, "Interstellar", "drama");
        Movie second = new Movie(2, 2, "Team A", "action");
        Movie third = new Movie(3, 3, "It", "Horror");
        manager.add(first);
        manager.add(second);
        manager.add(third);

        Movie[] expected = new Movie[] {third, second, first};
        Movie[] actual = manager.getAll();

        assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldShowFiveMovies() {
        Movie first = new Movie(1, 1, "Interstellar", "drama");
        Movie second = new Movie(2, 2, "Team A", "action");
        Movie third = new Movie(3, 3, "It", "horror");
        Movie fourth = new Movie(4, 4, "Dune", "fiction");
        Movie fifth = new Movie(5, 5, "Die Hard", "action");
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        Movie[] expected = new Movie[] {fifth, fourth,third, second};
        Movie[] actual = manager.getAll();

        assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldShowFourMovies() {
        Movie first = new Movie(1, 1, "Interstellar", "drama");
        Movie second = new Movie(2, 2, "Team A", "action");
        Movie third = new Movie(3, 3, "It", "horror");
        Movie fourth = new Movie(4, 4, "Dune", "fiction");
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        Movie[] expected = new Movie[] {fourth, third, second, first};
        Movie[] actual = manager.getAll();

        assertArrayEquals(expected, actual);

    }

}




