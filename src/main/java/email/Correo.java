package email;

import java.util.ArrayList;
import java.util.List;


public class Correo {

    public String asunto;
    public String contenido ;
    public List<Contacto> para;
    public Contacto remitente;

    public Correo(){
        this.remitente = new Contacto();
        this.para = new ArrayList<>();
    }

    public Correo(String asunto, String contenido, Contacto remitente, List<Contacto> para){
        this.asunto = asunto;
        this.contenido = contenido;
        this.para = para;
        this.remitente = remitente;
    }
    
    public String getAsunto() {
        return asunto;
    }
    
    public String getConetenido() {
        return contenido;
    }
    
    public void setConetenido(String conetenido) {
        this.contenido = conetenido;
    }

    public List<Contacto> getPara() {
        return para;
    }
    
    public Contacto getRemintente() {
        return remitente;
    }

}


