package email;

import java.util.ArrayList;
import java.util.List;

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
    
    public void enviarCorreo(Correo correo){
        crearBuzon(correo);
        agregaCorreoBandejaEnviados();
        agregaCorreoBandejaEntrada();

    }
}