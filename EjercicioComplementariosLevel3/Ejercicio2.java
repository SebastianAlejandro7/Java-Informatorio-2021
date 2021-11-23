/*Dada una lista que contiene números enteros, se deberá generar otra lista que contendrá el resultado de aplicar la operación de potencia a 2.
Input (Entrada):
List<Integer> palabras = List.of(1, 2, 3, 4, 5);
Output (Salida):
[1, 4, 9, 16, 25]*/

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        Integer potencia  = 2;
        List<Integer> numPotenciados = palabras.stream()
                                            .map(p-> Ejercicio2.calculoPotencia(p, potencia))
                                            .collect(Collectors.toList());
        System.out.println(numPotenciados);
    }
    public static Integer calculoPotencia(Integer numero, Integer potencia) {
        if (potencia == 0){
            return 1;
        }else {
            return numero * calculoPotencia(numero, potencia-1);
        }
    }
}
