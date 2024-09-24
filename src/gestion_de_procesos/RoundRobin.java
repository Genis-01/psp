package gestion_de_procesos;

import java.util.ArrayList;

public class RoundRobin {
    public static void main(String[] args) {


        ArrayList<Proceso> procesos = new ArrayList<>();
        procesos.add(new Proceso(1,30));
        procesos.add(new Proceso(2,25));
        procesos.add(new Proceso(3,40));
        procesos.add(new Proceso(4,50));
        procesos.add(new Proceso(5,20));
        procesos.add(new Proceso(6,30));

        System.out.println("empiezo");
        while (!procesos.isEmpty()) {
            Proceso proceso = procesos.getFirst();
            procesos.remove(0);
            System.out.println(proceso.toString() + "-5=" + (proceso.tiempoRestante-5));
            proceso.tiempoRestante-=5;
            if (proceso.tiempoRestante>=0) {
                procesos.add(proceso);
            }

        }




        System.out.println("acabe");


    }
}