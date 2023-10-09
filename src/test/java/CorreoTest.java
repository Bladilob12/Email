import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

import email.Contacto;
import email.Correo;


public class CorreoTest {
    @Test 
    public void createCorreo(){
        
        Correo correo = new Correo();
        assertNotNull(correo);

    }
    @Test
    public void correoCaracteristicas(){

    Contacto remitente = new Contacto();
    Correo correo1 = new Correo("Saludo", "Holaa",remitente ,new ArrayList<>());

     assertEquals(correo1.getAsunto(),"Saludo");
     assertEquals(correo1.getContenido(),"Holaa");
     assertEquals(correo1.getFecha(),"10/5/2023");

    }
}
