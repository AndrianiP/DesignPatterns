package decorator;

import java.util.*;

public class SpecialChars extends PasswordDecorator {
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
        this.password = passwordBeginning.getPassword();
        ArrayList<String> tempArrayList = new ArrayList<String>();
        ArrayList<String> specialChar = new ArrayList<String>();
        specialChar.add("*");
        specialChar.add("!");
        specialChar.add("%");
        specialChar.add("+");
        specialChar.add(".");
        specialChar.add("{");
        specialChar.add("}");

        for (int i = 0; i < this.password.length(); i++) {
            char temp = this.password.charAt(i);
            Random r = new Random();
            int rNum = r.nextInt(10);
            tempArrayList.add(String.valueOf(temp));
            if (rNum == 0 || rNum == 1 || rNum == 2) {
                int rSpecial = r.nextInt(7);
                tempArrayList.add(specialChar.get(rSpecial));
            }
        }
        this.password = String.join("", tempArrayList);
    }

    public String getPassword() {
        return this.password;
    }
}
