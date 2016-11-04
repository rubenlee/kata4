package kata4;
public class mail {
    private final String mail;

    public mail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }
    
    public String getDomain(){
        return mail.split("@")[1];
    }
}
