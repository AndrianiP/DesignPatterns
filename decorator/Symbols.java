package decorator;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;


public class Symbols extends PasswordDecorator {


    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
        int counter = 0;
        this.password = passwordBeginning.getPassword();
        HashMap<String, String> conversion = new HashMap<String, String>();
        ArrayList<CharSequence> tempArrayList = new ArrayList<CharSequence>();

        for (int i = 0; i < this.password.length(); i++) {
            char temp = this.password.charAt(i);
            conversion.put(String.valueOf(temp), String.valueOf(temp));
        }
        //conversion.put("a", "@");
        //conversion.put("b", "8");
        //conversion.put("e", "3");
        //conversion.put("g", "9");
        //conversion.replace("i", "!");
        //conversion.put("o", "o");
        //conversion.put("s", "0");
      //  conversion.put("t", "7");
        /*
        for(conversion.entrySet().forEach( entry -> {
            
            char tempChar = entry.getValue().charAt(0);
            tempArrayList.add(tempChar);
            this.password = String.join("", tempArrayList);
            i++;
        });
        */
        //Some stackoverflow trying to currently debug and see how it works from what i read
        String reduced = conversion.values().stream().map(String::toString).reduce("", String::concat);
        this.password = reduced;
    }  
    public String getPassword() {

        return this.password;
    }
}
