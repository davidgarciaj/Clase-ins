import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private ArrayList<Alumno> alumnos;
    private String[] nombres = {"Juan","Paco","Pepe","Enrique","Jose"};

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        alumnos = new ArrayList<>();

        Random rdn = new Random();
        for (int i = 0; i < nombres.length; i++){            
            alumnos.add(new Alumno(nombres[i],rdn.nextInt(16)+3));
            alumnos.get(i).addNota(rdn.nextInt(11));            
            alumnos.get(i).addNota(rdn.nextInt(11));
            alumnos.get(i).addNota(rdn.nextInt(11));
        }

        Collections.shuffle(alumnos);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void text()
    {
        for (int i = 0; i < alumnos.size(); i++){  
            System.out.println("Alumno nº " + (i + 1));
            alumnos.get(i).informacion();
            System.out.println();
            System.out.println();
        }
    }
}
