package decorator;

public abstract class PasswordDecorator extends Password {
    protected Password passwordBeginning;

    public PasswordDecorator(Password passwordBeginning) {

    }

    public abstract String getPassword();
}
