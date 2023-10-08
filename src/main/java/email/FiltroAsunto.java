package email;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroAsunto {
    public List<Correo> filtrarAsunto(Buzon buzon, String asunto) {

        List<Correo> bandejaEntrada = buzon.getBandejaEntrada();

        List<Correo> correoFiltrado = bandejaEntrada.stream().filter(correo -> correo.getAsunto().contains(asunto)).collect(Collectors.toList());

        return correoFiltrado;
    }
}
