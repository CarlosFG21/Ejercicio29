/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio29video35;

/**
 *
 * @author DELL
 */
public class Ejercicio29Video35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      /*  empleado2 empleado1 = new empleado2("PACO GOMEZ " , 8500,1990,12,17);
        
        empleado2 empleado2 = new empleado2("ANA LOPEZ " , 9500,1995,06,02);
        
        empleado2 empleado3 = new empleado2("MARIA MARTIN " , 105,2002,03,15);
        
        empleado1.subSueldo(5);
        
        empleado2.subSueldo(5);
        
        empleado3.subSueldo(5);
        
        System.out.println("NOMBRE: "+empleado1.dameNombre() + " SUELDO: " + empleado1.dameSueldo()
        + " FECHA DE ALTA: " + empleado1.dameFechaContrato());
        
        System.out.println("NOMBRE: "+empleado2.dameNombre() + " SUELDO: " + empleado2.dameSueldo()
        + " FECHA DE ALTA: " + empleado2.dameFechaContrato());
        
        System.out.println("NOMBRE: "+empleado3.dameNombre() + " SUELDO: " + empleado3.dameSueldo()
        + " FECHA DE ALTA: " + empleado3.dameFechaContrato());*/
      
      empleado2[] misempleados = new empleado2[3];
      
      misempleados[0] = new empleado2("PACO GOMEZ " , 8500,1990,12,17);
      
      misempleados[1] = new empleado2("ANA LOPEZ " , 9500,1995,06,02);
      
      misempleados[2] = new empleado2("MARIA MARTIN " , 105,2002,03,15);
      
      /*for(int i=0; i < 3; i++){
          
          misempleados[i].subSueldo(5);
      }*/
      
      for(empleado2 e : misempleados){
          
          e.subSueldo(5);
      }
      
      for(empleado2 e:misempleados){
          
          System.out.println("NOMBRE: " + e.dameNombre() + 
                  "SUELDO: " + e.dameSueldo()+ " FECHA DE ALTA " +
                  e.dameFechaContrato());
      }
      
      /*for(int i=0; i<3; i++){
          
          System.out.println("NOMBRE: " + misempleados[i].dameNombre() + 
                  "SUELDO: " + misempleados[i].dameSueldo()+ " FECHA DE ALTA " +
                  misempleados[i].dameFechaContrato());
      }*/
      
      
        
        
        
    }
    
}
