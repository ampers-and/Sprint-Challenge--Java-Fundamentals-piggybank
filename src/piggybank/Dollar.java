package piggybank;

public class Dollar extends Coin {
    // constructors
    public Dollar() {
        super();
        value = 1.00;
    }

    public Dollar(int amount) {
        super(amount);
        value = 1.00;
    }

    @Override
    public String toString() {
        return "\n$" + amount;
    }
}