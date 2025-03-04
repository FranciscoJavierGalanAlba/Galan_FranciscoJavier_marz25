/**
 * Clase que representa una libro con las propiedades titulo,
 * autor y anioPublicacion
 * Tiene sus constructores y sus metodos getter and setter
 *
 * @author Javier Galan
 * @version 4.3.2025
 */
public class Libro {

    // TODO: Documentar estos atributos
    /**
     * Propiedad titulo del libro
     */
    private String titulo;

    /**
     * Propiedad autor del libro
     */
    private String autor;

    /**
     * Propiedad año de publicacion del libro
     */
    private int anioPublicacion;


    // TODO: Documentar este método
    // TODO: Testear este método

    /**
     * Constructor con parametros
     * @param titulo sera el titulo del libro
     * @param autor sera el autor del libro
     * @param anioPublicacion sera el año de publicacion del libro
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * metodo get, devuelve el titulo del libro
     * @return titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * metodo set, obtiene el titulo del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método
    /**
     * metodo get, devuelve el autor del libro
     * @return autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * metodo set, obtiene el autor del libro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método
    /**
     * metodo get, devuelve el año de publicacion del libro
     * @return anioPublicacoin del libro
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    /**
     * metodo set, obtiene el año de publicacion del libro
     * @return anioPublicacion del libro 1
     */
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
