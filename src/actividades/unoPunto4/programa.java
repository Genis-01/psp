package actividades.unoPunto4;

import javax.tools.JavaCompiler;
import java.io.IOException;

public class programa {
    public static void main(String[] args) throws IOException, InterruptedException {

        ProcessBuilder pb = new ProcessBuilder("java", "LeerNombre.java");
        Process p = pb.start();
        p.waitFor();


    }
}
