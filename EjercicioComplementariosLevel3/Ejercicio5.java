/*Se posee una Lista con objetos de clase Alumno con los atributos: apellido,
nombre y fechaDeNacimiento (con tipos: String, String y LocalDate). 
Se desea generar un Map<String, Integer> donde la clave de Map será el apellido
concatenado con el nombre (con separador de espacio en blanco) y el value la
edad del alumno.
La lista de entrada debe estar cargada con varios alumnos (al menos 5) para subir el ejemplo y demostrar su funcionamiento.
En ejemplo se muestra solo con 1 Alumno a modo de abreviar
En el ejemplo también se usa LocalDate.now().minusYears(30), en el ejercicio a presentar se deberá usar otra tecnica de construcción para la fecha (no usar .now(). Pueden ver métodos .parse(), etc)
*/
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumnos> alumnos = List.of(
                new Alumnos("Homero", "Simpson", LocalDate.now().minusYears(30)),
                new Alumnos("Mark", "Osmond", LocalDate.of(1996, 3, 10)),
                new Alumnos("Carl", "Shawerson", LocalDate.of(1998,10, 12)),
                new Alumnos("Susan", "Marrit", LocalDate.of(2000, 8, 30)),
                new Alumnos("Dimons", "Oswald", LocalDate.of(1999, 3, 12))); 
        Map<String, Integer> alumnosEdad = alumnos.stream()
                .collect(Collectors
                        .toMap(al-> (al.getName() + " " + al.getSurname()),
                                al -> Ejercicio5.getEdad(al.getBirthday())));
        System.out.println(alumnosEdad);
    }
    public static Integer getEdad(LocalDate birthDate){
        return Period.between(birthDate, LocalDate.now()).getYears();            
    }
}
