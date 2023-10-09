import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import email.Contacto;
import email.Correo;
import email.FiltroRemitente;

public class FiltroRemitenteTest {
     @Test
    public void testFiltrar() {
        // Crear algunos correos para las pruebas
        Contacto remitente1 = new Contacto("Remitente 1", "remitente1@example.com");
        Contacto remitente2 = new Contacto("Remitente 2", "remitente2@example.com");
        Contacto remitente3 = new Contacto("Remitente 3", "remitente3@example.com");

        Correo correo1 = new Correo("Asunto 1", "Contenido 1", remitente1, null);
        Correo correo2 = new Correo("Asunto 2", "Contenido 2", remitente2, null);
        Correo correo3 = new Correo("Asunto 3", "Contenido 3", remitente3, null);

        // Crear un filtro de remitente
        FiltroRemitente filtro = new FiltroRemitente(remitente1);

        // Filtrar los correos
        List<Correo> correosFiltrados = filtro.filtrar(Arrays.asList(correo1, correo2, correo3));

        // Verificar que solo se encuentre el correo1 en los resultados
        assertEquals(1, correosFiltrados.size());
        assertEquals(correo1, correosFiltrados.get(0));
    }
}
