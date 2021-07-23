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
public class ClaseE {
    
//metodo de clase de salida   
   public static void correr(){
       System.out.println("HOLA SOY EL METODO DE CORRER");
   
   }
    
//metodo de clase de retorno
   
   public static String retornarDatos(){
       String x;
      x="Como estas";
      return x;       
         
   }
//metodo de instancia de salida 
   
   public void bailar(){
   
       System.out.println("Hola hoy voy a salir a bailar");
   }
//metodo de instancia de retorno 
   
   public boolean contar(){
       return 3==4;
   
   }
}
