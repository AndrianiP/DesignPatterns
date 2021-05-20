package decorator;

import java.util.*;

public class RandomCasing extends PasswordDecorator {

    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
        this.password = passwordBeginning.getPassword();
        ArrayList<String> tempArrayList = new ArrayList<String>();
        for (int i = 0; i < this.password.length(); i++) {
            char temp = this.password.charAt(i);
            Random r = new Random();
            int rNum = r.nextInt(2);
            switch (rNum) {
                case 0:
                    tempArrayList.add(String.valueOf(temp).toLowerCase());
                    break;

                default:
                    tempArrayList.add(String.valueOf(temp).toUpperCase());
                    break;
            }
        }
        this.password = String.join("", tempArrayList);
    }

    public String getPassword() {
        return this.password;
    }
}
