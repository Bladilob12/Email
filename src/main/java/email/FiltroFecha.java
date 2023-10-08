package email;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroFecha {
    public List<Correo> filtrarFecha(Buzon buzon, String fecha) {

        List<Correo> bandejaEntrada = buzon.getBandejaEntrada();

        List<Correo> correoFiltrado = bandejaEntrada.stream().filter(correo -> correo.getFecha().contains(fecha)).collect(Collectors.toList());

        return correoFiltrado;
    }
}