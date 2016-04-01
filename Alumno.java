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
    public static final int  MIN_APROBADO = 5;
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
    
    /**
     * 
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * 
     */
    public int getEdad(){
        return edad;
    }
    
    /**
     * 
     */
    public int getNumeroAlumno(){
        return numeroAlumno;
    }
    
    /**
     * 
     */
    public void unaNotaMas(int nota){
        notas.add(nota);
    }
    
    /**
     * 
     */
    public float mediaNotas(){
        float media = 0;
        for(int i=0; i < notas.size();i++){
            media+= notas.get(i);
        }
        if(!notas.isEmpty()){media = media/notas.size();}
        return media;
    }
    
    /**
     * 
     */
    public boolean aprobado(){
       boolean aprobado = false;
       if(mediaNotas() >= MIN_APROBADO){
        aprobado = true;
       }
       return aprobado;
    }
}
