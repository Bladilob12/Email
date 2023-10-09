import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import email.Buzon;
import email.Contacto;
import email.Correo;
import email.EmailManager;
import email.FiltroCorreosRecibidos;
import email.FiltroPara;

public class FiltrarParaTest {
    @Test
    public void filtrarMailsRecibidosUsuario(){

        EmailManager mailManager = new EmailManager();

        Buzon buzon = new Buzon(new ArrayList<>(),new ArrayList<>(),"Alex@gmail.com");

        mailManager.listaBuzones.add(buzon);

        List<Contacto> para = new ArrayList<>();

        Contacto remitente = new Contacto("Barco", "colito123@gmail.com");
        Contacto remitente1 = new Contacto("valentin", "valentini@gmail.com");
        Contacto destinatario = new Contacto("Alex","Alex@gmail.com");

        para.add(destinatario);

        Correo correo = new Correo();
        correo.setPara(para);
        correo.setRemitente(remitente);

        Correo correo1 = new Correo();
        correo1.setPara(para);
        correo1.setRemitente(remitente);

        Correo correo2 = new Correo();
        correo2.setPara(para);
        correo2.setRemitente(remitente1);

        mailManager.enviarCorreo(correo);
        mailManager.enviarCorreo(correo1);
        mailManager.enviarCorreo(correo2);

        FiltroCorreosRecibidos filtroPara = new FiltroCorreosRecibidos();

        filtroPara.filtrarCorreos(buzon, "valentini@gmail.com");

        assertEquals(filtroPara.listaMailsUsuario.size(),1);
        assertEquals(filtroPara.listaMailsUsuario.get(0), correo2);
    }
}