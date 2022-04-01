
package ejercicio1.semana1;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Ejercicio1Semana1 {

   
    public static void main(String[] args) {

       NumberFormat Formato = new DecimalFormat("#0.00");
        //Declaracion de variables
        
        double R1, R2, R3, R4, Req, Rdeno;
        
        R1 = 5.1;
        R2 = 68;
        R3 = 75;
        R4 = 82;
        
        Rdeno = ((1/R1)+(1/R2)+(1/R3)+(1/R4));
        Req = 1/Rdeno;
        
        System.out.println("La resistencia equivalente es: " + Formato.format(Req));       
    }
}