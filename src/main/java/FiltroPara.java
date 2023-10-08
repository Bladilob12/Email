import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import email.Buzon;
import email.Contacto;
import email.Correo;

public class FiltroPara {
    public void filtrarPara(Correo correo){

        List<Buzon> listaMailsUsuario = new ArrayList<>();

        for (Contacto destinatario : correo.para) {
            Predicate<Buzon> buscarBuzon = b -> destinatario.getMail().equals(b.getMail());
            
            listaMailsUsuario.addAll(listaMailsUsuario.stream().filter(buscarBuzon).collect(Collectors.toList()));
        }
        for (Buzon buzon : listaMailsUsuario) {
            buzon.bandejaEntrada.add(correo);
        }
    }
}
