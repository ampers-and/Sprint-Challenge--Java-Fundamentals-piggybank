package piggybank;

public class Penny extends Coin {
    // constructors
    public Penny() {
        super();
        value = .01;
    }

    public Penny(int amount) {
        super(amount);
        value = .01;
    }

    @Override
    public String toString() {
        if (amount == 1) {
            return "\n" + amount + " Penny";
        } else
            return "\n" + amount + " Pennies";
    }
}