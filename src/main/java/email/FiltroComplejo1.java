package email;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroComplejo1 {
  public class Buzon {
    private List<Correo> bandejaEntrada = new ArrayList<>();

    // Métodos para agregar correos a la bandeja de entrada y otros métodos...

    public List<Correo> filtrarPorContenidoYAsunto(String contenido, String asunto) {
        FiltroContenido filtroContenido = new FiltroContenido();
        FiltroAsunto filtroAsunto = new FiltroAsunto();

        List<Correo> correosFiltradosPorContenido = filtroContenido.filtrarContenido(this, contenido);
        List<Correo> correosFiltradosPorAsunto = filtroAsunto.filtrarAsunto(this, asunto);

        // Intersección de las listas de correos filtrados
        correosFiltradosPorContenido.retainAll(correosFiltradosPorAsunto);

        return correosFiltradosPorContenido;
    }

    // Otros métodos de la clase Buzon...
}

}


