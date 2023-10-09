import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import email.Buzon;
import email.Contacto;
import email.Correo;
import email.EmailManager;

public class BuzonTest {
    @Test
    public void crearBuzon_Test(){

        EmailManager mailmanager = new EmailManager(); 

        List<Contacto> para = new ArrayList<>();

        Contacto remitente = new Contacto("sensei", "therealsensei@gmail.com.ar");
        Contacto destinatario = new Contacto("lucho","aquinopla@gmail.com");
        Contacto destinatario1 = new Contacto("lucho","aquinopla@gmail.com");
        
        Correo correo = new Correo("buenas", "hola", remitente , para);

        correo.para.add(destinatario);
        correo.para.add(destinatario1);
        mailmanager.crearBuzon(correo);

        assertTrue(mailmanager.listaBuzones.get(0).getMail().contains("therealsensei@gmail.com.ar"));
        assertTrue(mailmanager.listaBuzones.get(1).getMail().contains("aquinopla@gmail.com"));
        assertTrue(mailmanager.listaBuzones.get(2).getMail().contains("aquinopla@gmail.com"));   
    }
    @Test 
    public void bandejaEntradaIsEmpty(){
       
        Buzon buzon1 = new Buzon(new ArrayList<>(),new ArrayList<>(), "hola");

        assertTrue(buzon1.getBandejaEntrada().isEmpty());
    }
    @Test 
    public void bandejaEnviadosIsEmpty(){
       
        Buzon buzon1 = new Buzon(new ArrayList<>(),new ArrayList<>(), "hola");

        assertTrue(buzon1.getBandejeEnviados().isEmpty());
    }
}
