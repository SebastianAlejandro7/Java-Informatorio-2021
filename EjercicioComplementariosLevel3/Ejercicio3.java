/*Se dispone de una lista de Strings, de la cual saber la cantidad de valores que comiencen con la letra B (tanto mayúscula como minúscula, en ese caso decimos que será ignoreCase).
Input (Entrada):
List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac",);
Output (Salida):
3*/
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl",
        "Wonder Woman", "brainiac");
        Long cantidad = palabras.stream()
                        .filter(pal -> pal.startsWith("B") || pal.startsWith("b"))
                        .count();
        System.out.println(cantidad);
    }
}