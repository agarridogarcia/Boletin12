
package boletin12;

import javax.swing.JOptionPane;


public class Boletin12 {

    public static void main(String[] args) {
      //while((Garaxe.getNumPlazas()-Garaxe.getNumeroCoches())>0){
      
      Garaxe aparca1= new Garaxe("1234AB");
      aparca1.aparcar(); 
      aparca1.prezoHora();
      aparca1.amosarFactura();
      
      Garaxe aparca2= new Garaxe("0987VB");
      aparca2.aparcar();
      aparca2.prezoHora();
      aparca2.amosarFactura();
      
      /*Garaxe aparca3= new Garaxe("3456GH");
      aparca3.aparcar();
      Garaxe aparca4= new Garaxe("6789VB");
      aparca4.aparcar();
      Garaxe aparca5= new Garaxe("6780NB");
      aparca5.aparcar();*/
     
    }
    
}
