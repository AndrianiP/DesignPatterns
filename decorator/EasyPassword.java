package decorator;

import java.util.*;

public class EasyPassword extends Password{
    
    public EasyPassword(String phrase) {
        this.password = phrase;
        this.password = this.password.replaceAll("\\s","");
        Random r = new Random();
        int temp = r.nextInt(99);
        String randNum = Integer.toString(temp);
        this.password = this.password + randNum;
    }
    
    public String getPassword() {
        return this.password;
    }
}
