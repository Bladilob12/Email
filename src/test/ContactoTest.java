
public class ContactoTest {
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
    public void createContacto(){

        Contacto contacto = new Contacto();
        assertNotNull(contacto);
    } 
}
