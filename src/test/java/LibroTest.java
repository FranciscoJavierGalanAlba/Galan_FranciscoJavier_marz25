import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {
    Libro libro = new Libro();

    @BeforeEach
    void setUp() {
        libro = new Libro("The Art of Computer Programming", "Donald Knuth", 1968);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getTitulo() {
    }

    @Test
    void setTitulo() {
    }

    @Test
    void getAutor() {
    }

    @Test
    void setAutor() {
    }

    @Test
    void getAnioPublicacion() {
    }

    @Test
    void setAnioPublicacion() {
    }
}