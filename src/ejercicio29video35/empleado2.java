
package ejercicio29video35;

import java.util.*;

public class empleado2 {
    
    public empleado2(String nom,double sue,int agno,int mes,int dia){
      
        nombre=nom;
        sueldo = sue;
        
        GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
        
        altaContrato = calendario.getTime();
  }

    empleado2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  public String dameNombre(){
      
      return nombre;
  }  
  
  public double dameSueldo(){ //geter
      
      return sueldo;
  }
  
  public Date dameFechaContrato(){
      
      return altaContrato;
  }
  
  public void subSueldo(double porcentaje){
      
      double aumento = sueldo*porcentaje/100;
      
      sueldo+=aumento;
  }
  private String nombre;
  private double sueldo;
  private Date altaContrato;
  
  
}
