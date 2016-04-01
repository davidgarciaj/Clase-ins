import java.util.ArrayList;
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    public static int NUM_ALUMNOS = 0;
    private int numeroAlumno;
    private String nombre;
    private int edad;
    private ArrayList<Integer> notas;

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre, int edad)
    {
        NUM_ALUMNOS++;
        numeroAlumno = NUM_ALUMNOS;
        this.nombre = nombre;
        this.edad = edad;
        notas = new ArrayList<>();
    }
}
