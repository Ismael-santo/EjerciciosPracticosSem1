
package ejercicio1.semana1;


public class Ejercicio2Semana1 {
    public  static  void  main ( String [] args ) {
   // declaramos variables
    double   Dolares, Europa, Reino_U, Australia, Canada, Usd;
    
    // establecemos valores a las variables
    Dolares =  100 ;
    Europa =  0,70 ;
    Reino_U =  0.61 ;
    Australia =  0,95 ;
    Canada =  0,97 ;
    Dólar estadounidense =  1,00 ;
    
      // realizamos la conversión
      double conversión1 = Dolares * Europa;
        System.out.println("La covensercion de Dolares a la moneda de Europa es : "  + conversión1);
      double conversion2 = Dolares * Reino_U;
        System.out.println(" Conversion de Dolares a la moneda de Reino Unido es : "  + conversion2);
      double conversión3 = Dolares * Australia;
        System.out.println("La covercion de Dolares a la moneda de Australia es : "  + conversión3);
      double conversión4 = Dolares * Canada;
        System.out.println("La covercion de Dolares a la moneda de Canada es : "  + conversión4);
      double conversión5 = Dolares * Usd;
        System.out.println("La convercion de Dolares a la moneda de USD es : "  + conversión5);
    
    
  }
}
