package email;

import java.util.ArrayList;
import java.util.List;


public class Correo {

    public String asunto;
    public String contenido ;
    public String fecha;
    public List<Contacto> para;
    public Contacto remitente;

    public Correo(){
        this.remitente = new Contacto();
        this.para = new ArrayList<>();
    }

    public Correo(String asunto, String contenido, Contacto remitente, List<Contacto> para,String fecha){
        this.asunto = asunto;
        this.contenido = contenido;
        this.para = para;
        this.remitente = remitente;
    }
    
    public String getAsunto() {
        return asunto;
    }
    
    public String getContenido() {
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
    public String getFecha() {
        return fecha;
    }
    public Contacto getRemitente() {
        return remitente;
    }

}


