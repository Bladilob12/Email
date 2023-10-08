import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import email.Buzon;
import email.Contacto;
import email.Correo;
import email.FiltroFecha;

public class FiltroFechaTest {
    @Test
    public void filtrarFechaTest(){
       
    Buzon buzon1 =  new Buzon();

    List<Correo> bandejaEntrada = new ArrayList<Correo>();
    
    Contacto remitente = new Contacto();
    Contacto remitente2 = new Contacto();
    Contacto remitente3 = new Contacto();
    
    Correo correo1 = new Correo("saludo", "Hola  estas",remitente ,new ArrayList<>(),"25/8");
    Correo correo2 = new Correo("saludo", "Hola como estas",remitente2 ,new ArrayList<>(),"25/8");
    Correo correo3 = new Correo("saludo", "Chau como estas",remitente3 ,new ArrayList<>(),"24/8");

    buzon1.setBandejaEntrada(bandejaEntrada);
    buzon1.getBandejaEntrada().add(correo1);

    buzon1.getBandejaEntrada().add(correo2);
    buzon1.getBandejaEntrada().add(correo3);

    FiltroFecha filtro = new FiltroFecha();
    List<Correo>correoFiltrado = filtro.filtrarFecha(buzon1,"25/8");
 
    assertEquals(2,correoFiltrado.size());
    
}
}