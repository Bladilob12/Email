import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import email.Correo;


public class CorreoTest {
    @Test 
    public void createCorreo(){
        
        Correo correo = new Correo();
        assertNotNull(correo);

    }
    
   
}
