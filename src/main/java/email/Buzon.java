package email;
import java.util.List;


public class Buzon {
    
    public String mail;
    public List<Correo> bandejaEnviados;
    public List<Correo> bandejaEntrada;

    public Buzon(){

    }
    public Buzon(List<Correo> bandejaEnviados,List<Correo> bandejaEntrada, String mail ){
        this.bandejaEnviados = bandejaEnviados;
        this.bandejaEntrada = bandejaEntrada;
        this.mail = mail;
    }

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
