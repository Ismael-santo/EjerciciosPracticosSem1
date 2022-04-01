
package ejercicio1.semana1;


public class Ejercicio4Semana1 {
    public  static  void  main ( String [] args ) {

   double  AFPT , AFPE , PagoAFP, PagoT, PagoF, Sueldo, Salario;


        Salario =  500 ;
        AFPT =  0,06 ;
        AFPE  =  0,065 ;
        PagoAFP = Sueldo *  AFPT ;

            PagoT = Sueldo *  AFPE ; PagoF = PagoAFP + PagoT;

        System.out.println("El esta pagando a la AFP la cantidad de: "  + PagoF);
    }

}
