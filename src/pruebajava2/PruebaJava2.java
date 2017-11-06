/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava2;
import javax.swing.JOptionPane;
/**
 *
 * @author LAB05
 */
public class PruebaJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         // TODO code application logic here
    int año =Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
   switch(año)
           {
        case 12:
           JOptionPane.showMessageDialog(null, "diciembre");
         break;
         case 11:
           JOptionPane.showMessageDialog(null, "noviembre");
         break;
         case 10:
           JOptionPane.showMessageDialog(null, "octubre");
         break;
         case 9:
           JOptionPane.showMessageDialog(null, "septiembre");
         break;
         case 8:
           JOptionPane.showMessageDialog(null, "agosto");
         break;
         case 7:
           JOptionPane.showMessageDialog(null, "julio");
         break;
         case 6:
           JOptionPane.showMessageDialog(null, "junio");  
         break;
         case 5:
           JOptionPane.showMessageDialog(null, "mayo");
         break;
         case 4:
           JOptionPane.showMessageDialog(null, "abril");
         break;
         case 3:
           JOptionPane.showMessageDialog(null, "marzo");
         break;
         case 2:
           JOptionPane.showMessageDialog(null, "febrero");
         break;
         case 1:
           JOptionPane.showMessageDialog(null, "enero");
         break;
          
         
    }
    
}
