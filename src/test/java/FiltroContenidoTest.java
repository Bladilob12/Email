import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import email.Buzon;
import email.Contacto;
import email.Correo;
import email.FiltroContenido;

public class FiltroContenidoTest {
    @Test
    public void filtrarContrnidoTest(){
        
        Buzon buzon1 =  new Buzon();

    List<Correo> bandejaEntrada = new ArrayList<Correo>();
    
    Contacto remitente = new Contacto();
    Contacto remitente2 = new Contacto();
    Contacto remitente3 = new Contacto();
    
    Correo correo1 = new Correo("saludo", "Hola  estas",remitente ,new ArrayList<>());
    Correo correo2 = new Correo("saludo", "Hola como estas",remitente2 ,new ArrayList<>());
    Correo correo3 = new Correo("saludo", "Chau como estas",remitente3 ,new ArrayList<>());

    buzon1.setBandejaEntrada(bandejaEntrada);
    buzon1.getBandejaEntrada().add(correo1);

    buzon1.getBandejaEntrada().add(correo2);
    buzon1.getBandejaEntrada().add(correo3);

    FiltroContenido filtro = new FiltroContenido();
    List<Correo>correoFiltrado = filtro.filtrarContenido(buzon1,"Hola");

    assertEquals(2,correoFiltrado.size());
    assertEquals("Hola  estas",correoFiltrado.get(0).getContenido());
    assertEquals("Hola como estas",correoFiltrado.get(1).getContenido());
}



}