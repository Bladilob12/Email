import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import email.Contacto;
import email.Correo;
import email.FiltroAsuntoRemitente;

public class FiltroAsuntoRemitenteTest {
    @Test
    public void testFiltrarRemitente() {

        Contacto remitente1 = new Contacto("mata", "matagonza@gmail.com");
        Contacto remitente2 = new Contacto("lucho", "Aquinopla@gamil.com");
        Contacto remitente3 = new Contacto("Remitente 3", "remitente3@example.com");
        
        List<Contacto> destinatarios = Arrays.asList(
            new Contacto("Corradi", "CorradiSebas@gmail.com"),
            new Contacto("valentina", "Lopezvalentina@gamil.com")
        );

        Correo correo1 = new Correo("saludo", "Hola como estas", remitente1, destinatarios);
        Correo correo2 = new Correo("saludo", "Hola como estas", remitente2, destinatarios);
        Correo correo3 = new Correo("despedida", "adios hasta luego", remitente3, destinatarios);

        FiltroAsuntoRemitente filtro = new FiltroAsuntoRemitente("saludo", remitente1);

        List<Correo> correosFiltrados = filtro.filtrar(Arrays.asList(correo1, correo2, correo3));

        assertEquals(1, correosFiltrados.size());
        assertEquals(correo1, correosFiltrados.get(0));
    }
}

