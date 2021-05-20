package decorator;

import java.util.*;

public class Symbols extends PasswordDecorator {

    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
        this.password = passwordBeginning.getPassword();
       
        ArrayList<String> tempArrayList = new ArrayList<String>();
        for (int i = 0; i < this.password.length(); i++) {
            char temp = this.password.charAt(i);

            switch (String.valueOf(temp)) {
                case "a":

                    tempArrayList.add("@");
                    break;
                case "b":
                    tempArrayList.add("8");
                    break;
                case "e":
                    tempArrayList.add("3");
                    break;
                case "g":
                    tempArrayList.add("9");
                    break;
                case "i":
                    tempArrayList.add("!");
                    break;
                case "o":
                    tempArrayList.add("0");
                    break;
                case "s":
                    tempArrayList.add("$");
                    break;
                case "t":
                    tempArrayList.add("7");
                    break;
                default:
                    tempArrayList.add(String.valueOf(temp));
                    break;
            }
        }

       
        this.password = String.join("", tempArrayList);
    }

    public String getPassword() {

        return this.password;
    }
}
