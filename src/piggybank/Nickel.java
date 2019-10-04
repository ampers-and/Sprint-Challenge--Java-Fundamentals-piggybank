package piggybank;

public class Nickel extends Coin {
    // constructors
    public Nickel() {
        super();
        value = .05;
    }

    public Nickel(int amount) {
        super(amount);
        value = .05;
    }

    @Override
    public String toString() {
        if (amount == 1) {
            return "\n" + amount + " Nickel";
        } else
            return "\n" + amount + " Nickels";

    }
}