package email;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmailManager{

    public List<Buzon> listaBuzones;


    public EmailManager(){
        listaBuzones = new ArrayList<>();
    }

    public void crearBuzon(Correo correo){
        Buzon buzon1 = new Buzon();

        buzon1.mail = correo.remitente.mail;
        listaBuzones.add(buzon1);

        for (Contacto destinatario : correo.para) {
            Buzon buzon = new Buzon();
            buzon.mail = destinatario.mail;
            listaBuzones.add(buzon);
        }
    }
    
    public void agregarCorreoBandejaEnviados(Correo correo){
        
        Predicate<Buzon> buscarbuzon = b -> correo.getRemintente().getMail().equals(b.getMail());
        List<Buzon> listaCorreoUsuario = listaBuzones.stream().filter(buscarbuzon).collect(Collectors.toList());

        for(Buzon buzon1 : listaCorreoUsuario){
            buzon1.bandejaEnviados.add(correo);
        }
    }

    public void agregarCorreoBandejaEntrada(Correo correo){
        List<Buzon> listaCorreoUsuario = new ArrayList<>();

        for(Contacto destinatario : correo.para){
            Predicate<Buzon> buscarEnBuzon = b -> destinatario.getMail().equals(b.getMail());
            listaCorreoUsuario.addAll(listaCorreoUsuario.stream().filter(buscarEnBuzon).collect(Collectors.toList()));
        }
        for(Buzon buzon1 : listaCorreoUsuario){
            buzon1.bandejaEntrada.add(correo);
        }
    }

    public void enviarCorreo(Correo correo){
        crearBuzon(correo);
        agregarCorreoBandejaEnviados(correo);
        agregarCorreoBandejaEntrada(correo);
    }
}