/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava2;
import javax.swing.JOptionPane;
/************************************************************************
 * Elda Solar
 * @author LAB05
 * Fecha: 06/11/2017
 * ClasePrograma cuenta
 * Responsabilidad:programa que pide contraseñas y sie pueden bloquear por 3 intentos fallidos
 */
public class ProgramaCuenta 
{
 
 public static void main(String[] args)
         
 {
     int clave;
     
  
  clave =Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuemro"));
  
  {
  if (clave ==12345)
  {
     JOptionPane.showMessageDialog(null, "clave correcta");
  }
  else
  {
    JOptionPane.showMessageDialog(null, "clave incorrecta"); 
    clave =Integer.parseInt(JOptionPane.showInputDialog("segundo intento"));
    JOptionPane.showMessageDialog(null, "clave incorrecta");
    clave =Integer.parseInt(JOptionPane.showInputDialog("tercer intento"));
   
  }
  while (clave==12345){
    JOptionPane.showMessageDialog(null, "cuenta bloqueada,comuniquese con soporte tecnico");
  
  
    
  }
      
  }
      
          
      }
  } 
     
 
    
    
    
    
    
    
    
    
    
 
 
  
    

