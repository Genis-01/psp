package actividades.unoPunto4;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;


public class programa {
    public static void main(String[] args) throws IOException, InterruptedException {

        File file = new File("C:\\Users\\zeder\\IdeaProjects\\SerPros\\src\\actividades\\unoPunto4");
        ProcessBuilder pb = new ProcessBuilder("java", "LeerNombre.java", "alvaro");

        pb.directory(file);  // Asigna el directorio de trabajo al proceso.

        Process p = pb.start();


        int codigo = p.waitFor();

        InputStream is = p.getInputStream();
        int salida;
        while ((salida = is.read())!= -1) {
            System.out.print((char) salida);
        }



        System.out.println(codigo);


    }
}
