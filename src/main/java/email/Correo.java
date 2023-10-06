package email;

import java.util.ArrayList;
import java.util.List;


public class Correo {

    public String asunto= "";
    public String conetenido = "";
    public List<Contacto> para;
    public Contacto remitente;

    public Correo(){
        this.remitente = new Contacto();
        this.para = new ArrayList<>();
    }
    
    public String getAsunto() {
        return asunto;
    }
    
    public String getConetenido() {
        return conetenido;
    }
    
    public void setConetenido(String conetenido) {
        this.conetenido = conetenido;
    }

    public List<Contacto> getPara() {
        return para;
    }
    
    public Contacto getRemintente() {
        return remitente;
    }



}


