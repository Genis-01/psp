package gestion_de_procesos;

import java.util.Comparator;

public class CompareDuracion implements Comparator<Proceso> {
    @Override
    public int compare(Proceso o1, Proceso o2) {
        return o1.duracion - o2.duracion;
    }
}
