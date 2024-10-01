package actividades.unoPunto4;

import java.util.Scanner;


public class LeerNombre {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Crea un objeto Scanner para leer de la entrada estándar.

        String nombre = ingresarNombre(scanner);  // Llama a la función para ingresar el nombre.
        System.out.println(nombre);
        System.exit(1);  // Termina el programa con éxito.

    }

    private static String ingresarNombre(Scanner scanner) {
        System.out.println("Ingrese su nombre:");
        String nombre;
        try {
           nombre = scanner.nextLine();  // Lee el nombre y lo devuelve.

        }catch (Exception e) {
            System.exit(-1);  // Termina el programa con error.
            return null;  // Este punto nunca se ejecuta.
        }
        if (nombre.matches("[a-zA-Z]+")&& nombre.length() > 2) {
            return nombre;  // Devuelve el nombre si es válido.
        }else {
            System.exit(-1);  // Termina el programa con error.
            return null;  // Este punto nunca se ejecuta.
        }

    }
}
