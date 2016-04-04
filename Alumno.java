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
    public void addNota(int nota){
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

    /**
     * 
     */
    public void informacion(){
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nNº Alumno: " + numeroAlumno);
        String notasAlumno = null;
        if(!notas.isEmpty()){
            notasAlumno = "Nota" + 1 + " " + notas.get(0) + ".\n";
            for(int i=1; i < notas.size();i++){
                notasAlumno+= "Nota" + (i+1) + " " + notas.get(i) + ".\n";
            }
        }
        if(notasAlumno != null){System.out.println(notasAlumno);}
        System.out.println("La nota media del alumno: " + mediaNotas());
        String aprobado;
        if(aprobado()){ aprobado = "aprobado";}else{ aprobado = "suspendido";}
        System.out.println("El alumno " + nombre + " ha sido " + aprobado + " con sus notas actuales.");
    }
}
