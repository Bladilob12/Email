import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import email.Buzon;
import email.Contacto;
import email.Correo;
import email.FiltroContenido; 

public class ContactoTest {
    @Test
    public void createContacto(){

        Contacto contacto = new Contacto();
        assertNotNull(contacto);
    } 
    @Test 
    public void agregarContactoPara(){

        Correo correo = new Correo();
        Contacto destinatario = new Contacto();
        Contacto destinatario2 = new Contacto();

        correo.para.add(destinatario);
        correo.para.add(destinatario2);

        assertTrue(correo.getPara().contains(destinatario));
        assertTrue(correo.getPara().contains(destinatario2));


    }

}
