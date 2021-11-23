/*Se dispone de una lista de Integer, de la cual queremos obtener otra lista aplicando la operación de factorial pero no se desean valores repetidos.
Input (Entrada)
List<Integer> palabras = List.of(1, 2, 4, 4, 4);
Output (Salida):
[1, 2, 24]*/
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);
        List<Integer> listaNueva = palabras.stream()
                .map(pal -> Ejercicio4.factorial(pal))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(listaNueva);
    }
    public static Integer factorial(Integer numero) {
        if (numero == 1){
            return 1;
        }else {
            return numero * factorial(numero-1);
        }
    }
}
