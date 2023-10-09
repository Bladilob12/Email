package email;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
            
        EmailManager mailManager = new EmailManager();
        Buzon buzon = new Buzon("gonza.mata2003@gmail.com",);

        mailManager.listMailbox.add(buzon);

        List<Contacto> para = new ArrayList<>();
        Contacto remitente = new Contacto("Alex", "Alex@gmail.com");
        Contacto remitente1 = new Contacto("Pedro", "Pedro@gmail.com");
        Contacto destinatario = new Contacto("Gonzalo","gonza.mata2003@gmail.com");
        
        para.add(destinatario);

        Correo correo = new Correo("Hola", "me llamo alex", remitente , para,"2/10");
        Correo correo1 = new Correo("Hola", "me llamo alex", remitente , para,"2/10");
        Correo correo2 = new Correo("Hola", "me llamo pedro", remitente1 , para,"2/10");

        mailManager.enviarCorreo(correo);
        mailManager.enviarCorreo(correo1);
        mailManager.enviarCorreo(correo2);

        FiltroPara filtroPara = new FiltroPara();

        filtroPara.filtrarPara(buzon, "Pedro@gmail.com");

        List<Correo> listaMailsUsuario = filtroPara.listaMailsUsuario;

    for (Correo correoFiltrado : listaMailsUsuario){
        System.out.println("Asunto: " + correoFiltrado.getAsunto());
        System.out.println("Contenido: " + correoFiltrado.getContenido());
        System.out.println("Remitente: " + correoFiltrado.getRemitente().getMail());
    }
    }
}