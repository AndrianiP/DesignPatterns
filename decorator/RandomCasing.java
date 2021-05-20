package decorator;

public class RandomCasing extends PasswordDecorator {
    
   
    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
        
    }

    public String getPassword(){
        return this.password;
    }
}
