
package boletin12;

import javax.swing.JOptionPane;

public class Garaxe {
    private int numeroCoches, matricula;
    
    public void aparcar (){
     int cont;
     numeroCoches=Integer.parseInt(JOptionPane.showInputDialog("Introduza o número de coches"));
     
         if(numeroCoches<=5){
             System.out.println("Plazas dispoñibles");
             numeroCoches=numeroCoches+1;
         }
             else{
             System.out.println ("Completo");
         }
             
         
     }
    }
    

