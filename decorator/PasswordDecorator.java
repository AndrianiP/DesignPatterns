package decorator;

public abstract class PasswordDecorator extends Password {
    protected Password passwordBeginning;

    public PasswordDecorator(Password passwordBeginning) {
        this.password = super.password;

    }

    public abstract String getPassword();
}
