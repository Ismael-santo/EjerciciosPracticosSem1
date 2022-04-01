
package ejercicio1.semana1;


public class Ejercicio3Semana1 {
    public  static  void  main ( String [] args ) {

// Declarar variable
  double SalarioTL, Renta, RentaTL,SueldoxH, Hora, Total;


     SueldoxH =  8 ;
     Hora =  36 ;
     Renta =  0.10 ;

     SalarioTL = SueldoxH * Hora;
     RentaTL = SalarioTL * Renta;
     Total = SalarioTL - RentaTL;


        System.out.println("El salario total del empleado es" + Total);
   }
}
    

