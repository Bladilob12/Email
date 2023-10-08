import java.util.ArrayList;
import java.util.List;

import email.Buzon;
import email.Correo;

public class FiltroAsuntoContenido {
        
public List<Correo> filtrarPorAsuntoYContenido(Buzon buzon, String asunto, String contenido) {
        List<Correo> bandejaEntrada = buzon.getBandejaEntrada();
        List<Correo> correosFiltrados = new ArrayList<>();

        for (Correo correo : bandejaEntrada) {
            if (correo.getAsunto().contains(asunto) && correo.getContenido().contains(contenido)) {
                correosFiltrados.add(correo);
            }
        }

        return correosFiltrados;
    }
}
