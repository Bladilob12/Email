package email;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class FiltroCorreosRecibidos {
    
    public List<Correo> listaCorreos = new ArrayList<>();

   public void filtrarCorreosRecibidos(Buzon usuario,String contacto){

    Predicate<Correo> buscarUsuario = mail -> contacto.equals(mail.getRemintente().getMail());
    
    listaCorreos.addAll(usuario.bandejaEntrada.stream().filter(buscarUsuario).collect(Collectors.toList()));
   }
}
