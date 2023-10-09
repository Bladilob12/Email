import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import email.Contacto;
import email.Correo;


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
    @Test
    public void contactoCaracteristicas(){
        Contacto contacto1 = new Contacto("Alex", "alex@gmail.com");

        assertEquals(contacto1.getMail(),"alex@gmail.com");
        assertEquals(contacto1.getName(),"Alex");
    }


}
