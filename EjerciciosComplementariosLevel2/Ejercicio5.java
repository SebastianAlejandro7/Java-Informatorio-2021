import java.util.Scanner;

class Empleado {
    public static void main(String[] args) {

        double sueldohora = 0;
        int horasextras = 0;
        double sueldohe = 0;
        double impuestos = 0;
        int hrstrabajadas = 0;
        double sueldo = 0;
        double sueldofinal = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el sueldo del empleado x hora");
        sueldohora = entrada.nextDouble();
        System.out.println("Ingrese las horas trabajadas a la semana");
        hrstrabajadas = entrada.nextInt();
        if (hrstrabajadas > 40) {
            horasextras = hrstrabajadas - 40;
        }
        sueldohe = horasextras * sueldohora * 2;
        sueldo = sueldohora * (hrstrabajadas + horasextras);
        if (sueldo >= 20000) {
            impuestos = sueldo * 0.25;
        } else {
            if (sueldo >= 15000) {
                impuestos = sueldo * 0.20;
            } else {
                if (sueldo >= 10000) {
                    impuestos = sueldo * 0.10;
                } else {
                    impuestos = 0;
                }
            }
        }
        sueldofinal = sueldo - impuestos;
        System.out.println("El Sueldo del Empleado es: " + sueldofinal);
    }
}
