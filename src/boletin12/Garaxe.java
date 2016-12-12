
package boletin12;


import javax.xml.datatype.Duration;
import java.time.Instant;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Garaxe {
    private static int numCoches=0, numPlazas=5;
    private String matricula;
    private final float menos3H=1.50f;
    private final float mas3H=0.20f;
    private int horas;

    public Garaxe() {
        numCoches++;
    }

    public Garaxe(String matricula) {
        numCoches++;
        this.matricula=matricula;
        
        
    }
    
    public static int getNumeroCoches() {
        return numCoches;
    }

    public static int getNumPlazas() {
        return numPlazas;
    }
    
    public void aparcar (){
    
         if(numCoches<numPlazas&&numCoches>=0){
             System.out.println("Plazas dispoñibles " + (numPlazas-numCoches));
         
         }
             else{
             System.out.println ("Completo" + numCoches);
         }
    }
    public void prezoHora(){
        horas=Integer.parseInt(JOptionPane.showInputDialog("Introduce as horas que estivo no parking: "));
        if(horas<=3){
            System.out.println("Precio horas: " + (menos3H));
        }
        else{
            System.out.println("Precio:" + ((horas-3)*mas3H+menos3H));
        }
        }
    public void amosarFactura(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Tempo: " + horas + " horas.");
        int cartos=Integer.parseInt(JOptionPane.showInputDialog("Introduce cartos para pagar o parking "));
        if (horas<3)
            System.out.println("Cartos devoltos: " + (cartos- menos3H));
        else 
            System.out.println("Cartos devoltos: " + (cartos -((horas-3)*mas3H+menos3H) ));
        
        
        
        
    }
        
        
        
        
    }
    
   




    

