import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] empleados = new String[20];
        double[] sueldos = new double[20];

        String nombreMayor;
        double mayorSueldo;

        int i = 0;

        System.out.println("Lectura de nombres y sueldos de empleados: ");
        System.out.print("Empleado " + (i + 1) + ": ");
        empleados[i] = sc.nextLine();
        System.out.print("Sueldo: ");
        sueldos[i] = sc.nextDouble();

        mayorSueldo = sueldos[i];
        nombreMayor = empleados[i];

        for (i = 1; i < empleados.length; i++) {
            sc.nextLine();
            System.out.print("Empleado " + (i + 1) + ": ");
            empleados[i] = sc.nextLine();
            System.out.print("Sueldo: ");
            sueldos[i] = sc.nextDouble();

            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                nombreMayor = empleados[i];
            }
        }

        System.out.println("Empleado con mayor sueldo: " + nombreMayor);
        System.out.println("Sueldo: " + mayorSueldo);
    }
}