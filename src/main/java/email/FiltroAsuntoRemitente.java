package email;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroAsuntoRemitente {
    private String asunto;
    private Contacto remitente;

    public FiltroAsuntoRemitente(String asunto, Contacto remitente) {
        this.asunto = asunto;
        this.remitente = remitente;
    }

    public List<Correo> filtrar(List<Correo> correos) {
        return correos.stream()
            .filter(correo -> correo.getAsunto().contains(asunto) && correo.getRemintente().equals(remitente))
            .collect(Collectors.toList());
    }
}
