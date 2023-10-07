import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import email.Buzon;
import email.Contacto;
import email.Correo;
import email.EmailManager;



public class CorreoTest {
    @Test 
    public void createCorreo(){
        
        Correo correo = new Correo();
        assertNotNull(correo);

    }
    
   
}
