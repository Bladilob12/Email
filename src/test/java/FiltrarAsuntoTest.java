import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import email.Buzon;
import email.Contacto;
import email.Correo;
import email.FiltroAsunto; // Asegúrate de que la clase FiltroAsunto esté importada correctamente

public class FiltrarAsuntoTest {

    @Test 
    public void filtrarAsuntoTest(){
        
        Buzon buzon1 =  new Buzon();

        List<Correo> bandejaEntrada = new ArrayList<Correo>();
        
        Contacto remitente = new Contacto();
        Contacto remitente2 = new Contacto();
        Contacto remitente3 = new Contacto();
        
        Correo correo1 = new Correo("saludo", "Hola  estas",remitente ,new ArrayList<>(),"25/8");
        Correo correo2 = new Correo("saludo", "Hola como estas",remitente2 ,new ArrayList<>(),"25/8");
        Correo correo3 = new Correo("despedida", "Chau como estas",remitente3 ,new ArrayList<>(),"25/8");
    
        buzon1.setBandejaEntrada(bandejaEntrada);

        buzon1.getBandejaEntrada().add(correo1);
        buzon1.getBandejaEntrada().add(correo2);
        buzon1.getBandejaEntrada().add(correo3);
    
        FiltroAsunto filtro = new FiltroAsunto();
        List<Correo> correoFiltrado = filtro.filtrarAsunto(buzon1,"saludo");
    
        assertEquals(2, correoFiltrado.size());
        assertEquals("saludo", correoFiltrado.get(0).getAsunto());
        assertEquals("saludo", correoFiltrado.get(1).getAsunto());
    } 
}

