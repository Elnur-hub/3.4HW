package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AfficheManagerSetUp {
    private AfficheManager manager = new AfficheManager();

    Movie first = new Movie(1, 1, "Interstellar", "drama");
    Movie second = new Movie(2, 2, "Team A", "action");
    Movie third = new Movie(3, 3, "It", "horror");
    Movie fourth = new Movie(4, 4, "Dune", "fiction");
    Movie fifth = new Movie(5, 5, "Die Hard", "action");
    Movie sixth = new Movie(6, 6, "Shameless", "drama");
    Movie seventh = new Movie(7, 7, "House M.D.", "drama");
    Movie eighth = new Movie(8, 8, "Green Mile", "drama");
    Movie ninth = new Movie(9, 9, "Schindler's List", "drama");
    Movie tenth = new Movie(10, 10, "Pulp Fiction", "criminal");
    Movie eleventh = new Movie(11, 11, "Agent 007", "spy action");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);


    }

    @Test
    public void shouldShowNineMovies() {
        Movie[] expected = new Movie[]{ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Movie[] actual = manager.getAll();
        assertArrayEquals(expected, actual);


    }


    @Test
    public void shouldShowTenMovies() {
        manager.add(tenth);


        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Movie[] actual = manager.getAll();
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowElevenMovies() {
        manager.add(tenth);
        manager.add(eleventh);

        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        Movie[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

}