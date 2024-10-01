package actividades.u1_shutdowner;

import java.util.Scanner;
import java.util.function.Function;

public class Shutdowner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Function<String, ProcessBuilder> createAndRunProcessBuilder = command -> {
            ProcessBuilder pb = new ProcessBuilder(command.split(" "));
            try {
                // Ejecutar el comando
                pb.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return pb;
        };

        Function<String, Integer> elegirTiempo = accion -> {
            System.out.println("cuanto tiempo deseas "+ accion + " (en segundos)?");
            return scanner.nextInt();
        };


        System.out.println("que quieres hacer?\n 1. apagar \n 2. reiniciar \n 3. suspender");

        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Apagando...");
                createAndRunProcessBuilder.apply("shutdown -s -t " + elegirTiempo.apply("apagar"));
                break;
            case 2:
                System.out.println("Reiniciando...");
                createAndRunProcessBuilder.apply("shutdown -r -t " + elegirTiempo.apply("reiniciar"));
                break;
            case 3:
                System.out.println("Suspending...");
                createAndRunProcessBuilder.apply("shutdown -h");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }








    }
}
