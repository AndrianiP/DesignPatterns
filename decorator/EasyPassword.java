package decorator;

public class EasyPassword extends Password{
    
    public EasyPassword(String phrase) {
        phrase = getPassword();
    }
    
    public String getPassword() {
        return this.password;
    }
}
