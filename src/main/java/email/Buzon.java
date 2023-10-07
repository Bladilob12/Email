package email;
import java.util.ArrayList;
import java.util.List;


public class Buzon {
    
    public String mail;
    public List<Correo> bandejaEnviados;
    public List<Correo> bandejaEntrada;

    public List<Correo> getBandejaEntrada() {
        return bandejaEntrada;
    }
    
    public List<Correo> getBandejeEnviados() {
        return bandejaEnviados;
    }

    public String getMail() {
        return mail;
    }

    public void setBandejaEntrada(List<Correo> bandejaEntrada) {
        this.bandejaEntrada = bandejaEntrada;
    }
}
