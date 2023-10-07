package email;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroContenido {

    public List<Correo> filtrarContenido(Buzon buzon, String contenido) {

        List<Correo> bandejaEntrada = buzon.getBandejaEntrada();

        List<Correo> correoFiltrado = bandejaEntrada.stream().filter(correo -> correo.getContenido().contains(contenido)).collect(Collectors.toList());

        return correoFiltrado;
    }



}
