package actividades.unoPunto5;


public class LeerNombre {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);  // Crea un objeto Scanner para leer de la entrada estándar.

        String nombre = args[0];  // Llama a la función para ingresar el nombre.

        if(!nombre.matches("[a-zA-Z]+")|| nombre.length() < 2) {
            System.out.println("Nombre inválido. Ingrese un nombre válido.");
            System.exit(-1);// Termina el programa con error.
        }else{
            System.out.println("Hola " + nombre + "!  Bienvenido!");
            System.exit(1); // Termina el programa con éxito.
        }


    }


//    private static String ingresarNombre(Scanner scanner) {
//        System.out.println("Ingrese su nombre:");
//        String nombre;
//        try {
//           nombre = scanner.nextLine();  // Lee el nombre y lo devuelve.
//
//        }catch (Exception e) {
//            System.exit(-1);  // Termina el programa con error.
//            return null;  // Este punto nunca se ejecuta.
//        }
//        return comprobarNombre(nombre);
//
//    }


}
