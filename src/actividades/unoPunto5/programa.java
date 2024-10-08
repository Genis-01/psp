package actividades.unoPunto5;


import java.io.*;


public class programa {
    public static void main(String[] args) throws IOException, InterruptedException {

        File error = new File("error.txt");
        File file = new File("C:\\Users\\zeder\\IdeaProjects\\SerPros\\src\\actividades\\unoPunto4");
        ProcessBuilder pb = new ProcessBuilder("java", "LeerNoombre.java", "alvaro");

        pb.directory(file);  // Asigna el directorio de trabajo al proceso.

        pb.redirectError(error);  // Redirecciona la salida de error al fichero error.txt.

        Process p = pb.start();



        try {

            InputStream er = p.getErrorStream() ;
            BufferedReader brer =
                    new BufferedReader (new InputStreamReader(er));
            String liner;

            while ((liner = brer.readLine () ) != null) {
                System.err.println(liner);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace () ;
        }


        int codigo = p.waitFor();

        InputStream is = p.getInputStream();
        int salida;
        while ((salida = is.read())!= -1) {
            System.out.print((char) salida);
        }



        System.out.println(codigo);


    }
}
