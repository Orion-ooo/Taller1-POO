
package local;

/**
 *
 * @author Daniel
 */
public class Ejercicio3_Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    public Ejercicio3_Estudiante() {
        this.nombre = "Nombre estudiante";
        this.edad = 0;
        this.curso = "Curso estudiante";
    }

    public Ejercicio3_Estudiante(String nombre, int edad) {
        this();
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Ejercicio3_Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", curso=" + curso + '}';
    }
    
} 
