package email;

import java.util.ArrayList;
import java.util.List;

public class FiltroContenidoFecha {
    public List<Correo> filtrarcontenidoYFecha(Buzon buzon, String contenido, String fecha) {
        
        List<Correo> bandejaEntrada = buzon.getBandejaEntrada();
        List<Correo> correosFiltrados = new ArrayList<>();

        for (Correo correo : bandejaEntrada) {
            if (correo.getContenido().contains(contenido) && correo.getFecha().contains(fecha)) {
                correosFiltrados.add(correo);
            }
        }
        return correosFiltrados;
    }
}

