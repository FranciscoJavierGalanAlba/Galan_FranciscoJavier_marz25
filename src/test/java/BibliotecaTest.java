import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {
    Libro libro;
    Biblioteca biblioteca = new Biblioteca();

    @BeforeEach
    void setUp() {
        libro = new Libro("The Art of Computer Programming", "Donald Knuth", 1968);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(this.libro));
    }

    @Test
    void eliminarLibro() {
    }

    @Test
    void getLibros() {
    }

    @Test
    void encuentraLibroPorTitulo() {
    }

    @Test
    void encuentaLibroPorAutor() {
        Biblioteca biblio = new Biblioteca();
        biblio.agregarLibro(this.libro);
        assertNotNull(biblio.getLibros()); //compruebo si getLibros es distinto de nulo
        assertEquals(biblio.getLibros().size(), 1); //compruebo el tamaño(solo tiene 1 libro)
        assertTrue(biblio.getLibros().contains(this.libro));//contiene el libro recien añadido
    }

    @Test
    void encuentraLibrosPorAutor() {
    }
}