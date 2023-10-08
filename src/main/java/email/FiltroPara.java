package email;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroPara {
    List<Buzon> listaMailsUsuario = new ArrayList<>();
    List<Contacto> destinatarios = correo.getPara(); // Obtén la lista de destinatarios del correo

    for (Contacto destinatario : destinatarios) {
        Predicate<Buzon> buscarBuzon = b -> destinatario.getMail().equals(b.getMail());
        
        // Filtra los buzones que coinciden con el destinatario y agrégalos a una nueva lista
        List<Buzon> buzonesFiltrados = listaMailsUsuario.stream().filter(buscarBuzon).collect(Collectors.toList());
        
        // Agrega los buzones filtrados a listaMailsUsuario
        listaMailsUsuario.addAll(buzonesFiltrados);
    }
    
    // Agrega el correo a la bandeja de entrada de los buzones encontrados
    for (Buzon buzon : listaMailsUsuario) {
        buzon.getBandejaEntrada().add(correo);
    }
}

