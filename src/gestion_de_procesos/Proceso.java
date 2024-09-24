package gestion_de_procesos;

public class Proceso implements Comparable<Proceso> {
    Integer idProceso;
    Integer duracion;
    Integer tiempoRestante;

    public Proceso(Integer idProceso, Integer duracion) {
        this.duracion = duracion;
        this.idProceso = idProceso;
        this.tiempoRestante = duracion;
    }
    public Proceso(Integer idProceso, Integer duracion, Integer tiempoRestante) {
        this.duracion = duracion;
        this.idProceso = idProceso;
        this.tiempoRestante = tiempoRestante;
    }



    @Override
    public int compareTo(Proceso o) {
        return idProceso - o.idProceso;
    }

    public int compareDuracion(Proceso o) {
        return duracion - o.duracion;
    }

    @Override
    public String toString() {
        return idProceso + " - " + duracion + ":  " + tiempoRestante;
    }
}
