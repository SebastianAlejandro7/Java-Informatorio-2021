import java.util.Scanner;

public class ejercicio4{
    public static void main(String[] args) {
       System.out.println(factorial(10));
    }
    public static double factorial (double numero) {
        if (numero==0)
          return 1;
        else
          return numero * factorial(numero-1);
  }
} 
