package email;

public class Contacto {
    
    private String name;
    public String mail;

    public String getName() {
        return name;
    }
    
    public String getMail() {
        return mail;
    }

    public Contacto(){

    }
    public Contacto(String name, String mail){
        this.name = name;
        this.mail= mail; 
    }



}
