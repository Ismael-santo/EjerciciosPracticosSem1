
package ejercicio1.semana1;

import java.text.DecimalFormat;


public class Ejercicio6Semana1 {
    public  static  void  main ( String [] args ) {
        
    
        NumberFormat Formato =  new  DecimalFormat ( " #0.00 " );
         double Promedio, Ev, Ev2, Ev3, Ev4, Ev5;
         
         Ev =  8.0  *  0.25 ;
         Ev2 =  7.5  *  0.15 ;
         Ev3 =  9.0  *  0.15 ;
         Ev4 =  8.0  *  0.20 ;
         Ev5 =  9.0  *  0.25 ;
         
         Promedio = Ev + Ev2   + Ev3 + Ev4 + Ev5;
         
                        System.out.println("El  promedio final del ciclo es: "  + Formato . format(Promedio));
    }
}
