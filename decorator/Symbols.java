package decorator;

public class Symbols extends PasswordDecorator {
    public Symbols(Password passwordBeginning){
        super(passwordBeginning);
        

    }
    public String getPassword(){

        return password;
    }
}
