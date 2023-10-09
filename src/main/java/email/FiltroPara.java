package email;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FiltroPara {
    public List<Correo> listaMailsUsuario = new ArrayList<>();

    public void filtrarPara(Buzon usuario, String contacto) {
        
        Predicate<Correo> buscarUsuario = mail -> contacto.equals(mail.getRemitente().getMail());
        
        listaMailsUsuario.addAll(usuario.bandejaEntrada.stream().filter(buscarUsuario).collect(Collectors.toList()));
    }    
}
