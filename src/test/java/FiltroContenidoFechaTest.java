import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import email.Buzon;
import email.Contacto;
import email.Correo;
import email.FiltroContenidoFecha;

public class FiltroContenidoFechaTest {
    @Test
        public void FiltrosAsuntocontenido(){
        Buzon buzon1 =  new Buzon();
        List<Correo> bandejaEntrada = new ArrayList<Correo>();
        
        Contacto remitente = new Contacto();
        Contacto remitente2 = new Contacto();
        Contacto remitente3 = new Contacto();
        
        Correo correo1 = new Correo("saludo", "Hola como estas",remitente ,new ArrayList<>(),"25/8");
        Correo correo2 = new Correo("saludo", "Hola como estas",remitente2 ,new ArrayList<>(),"25/8");
        Correo correo3 = new Correo("saludo", "Chau como estas",remitente3 ,new ArrayList<>(),"3/4");
    
        buzon1.setBandejaEntrada(bandejaEntrada);
        buzon1.getBandejaEntrada().add(correo1);
    
        buzon1.getBandejaEntrada().add(correo2);
        buzon1.getBandejaEntrada().add(correo3);
        
        FiltroContenidoFecha filtro = new FiltroContenidoFecha();
    
        List<Correo>correoFiltrado = filtro.filtrarcontenidoYFecha(buzon1,"Hola como estas","25/8");
        assertEquals(2,correoFiltrado.size());
    
        }
    }
