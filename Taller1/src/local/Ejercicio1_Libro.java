
package local;

/**
 *
 * @author Daniel
 */
public class Ejercicio1_Libro {
    private String titulo;
    private String autor;
    private int numPaginas;

    public Ejercicio1_Libro() {} // constructor por defecto

    public Ejercicio1_Libro(String titulo, String autor, int numPaginas) { // constructor con parametros
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // metodos getter y setters para gestionar los detalles del libro
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    
}
