package piggybank;

public class Quarter extends Coin {
    // constructors
    public Quarter() {
        super();
        value = .25;
    }

    public Quarter(int amount) {
        super(amount);
        value = .25;
    }

    @Override
    public String toString() {
        if (amount == 1) {
            return "\n" + amount + " Quarter";
        } else
            return "\n" + amount + " Quarters";

    }
}