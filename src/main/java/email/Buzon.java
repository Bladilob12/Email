package email;
import java.util.ArrayList;
import java.util.List;


public class Buzon {
    
    public String mail;
    public List<Correo> bandejeEnviados;
    public List<Correo> bandejeEntrada;

    public List<Correo> getBandejeEntrada() {
        return bandejeEntrada;
    }
    
    public List<Correo> getBandejeEnviados() {
        return bandejeEnviados;
    }

    public String getMail() {
        return mail;
    }
    
   
    int a;
}
