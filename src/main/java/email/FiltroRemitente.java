package email;

import java.util.stream.Collectors;
import java.util.List;


public class FiltroRemitente {
    private Contacto remitente;

    public FiltroRemitente(Contacto remitente) {
        this.remitente = remitente;
    }

    public List<Correo> filtrar(List<Correo> correos) {
        return correos.stream()
            .filter(correo -> correo.getRemintente().equals(remitente))
            .collect(Collectors.toList());
    }
}
