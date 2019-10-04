package piggybank;

public class Dime extends Coin {
    // constructors
    public Dime() {
        super();
        value = .10;
    }

    public Dime(int amount) {
        super(amount);
        value = .10;
    }

    @Override
    public String toString() {
        if (amount == 1) {
            return "\n" + amount + " Dime";
        } else
            return "\n" + amount + " Dimes";
    }
}