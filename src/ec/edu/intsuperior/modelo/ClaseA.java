/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author LIZ
 */
public class ClaseA {
//metodo de clase de salida   
   public static void cantar(){
       System.out.println("HOLA SOY EL METODO CANTAR");
   
   }
    
//metodo de clase de retorno
   
   public static String retornarDatos(){
       String x;
      x="Como te llamas";
      return x;       
         
   }
//metodo de instancia de salida 
   
   public void nadar(){
   
       System.out.println("Como estas vas a salir a nadar");
   }
//metodo de instancia de retorno 
   
   public boolean estudiar(){
       return 9==3;
   
   }
}
