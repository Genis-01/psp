package actividades.gestion_de_procesos;

import java.util.ArrayList;

public class RoundRobin {
    public static void main(String[] args) {


        ArrayList<Proceso> procesos = new ArrayList<>();
        procesos.add(new Proceso(1,31));
        procesos.add(new Proceso(2,26));
        procesos.add(new Proceso(3,40));
        procesos.add(new Proceso(4,50));
        procesos.add(new Proceso(5,20));
        procesos.add(new Proceso(6,30));

        System.out.println("empiezo");
        while (!procesos.isEmpty()) {
            Proceso proceso = procesos.getFirst();
            procesos.removeFirst();
            int tiempo = 5;
            if (proceso.tiempoRestante<5){
                 tiempo=proceso.tiempoRestante;
            }

            System.out.println(proceso.toString() + "-" + tiempo +"=" + (proceso.tiempoRestante-tiempo));
            proceso.tiempoRestante-=5;
            if (proceso.tiempoRestante>0) {
                procesos.add(proceso);
            }
            try {
                Thread.sleep(tiempo*100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }




        System.out.println("acabe");


    }
}