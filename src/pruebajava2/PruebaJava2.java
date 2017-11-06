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
         
    }
    
}
