package piggybank;

public abstract class Coin {
    // fields
    double value;
    int amount = 0;

    // Constructors
    public Coin() {
        amount += 1;
    }

    public Coin(int amount) {
        this.amount += amount;
    }

    // settters and getters
    public double getValue() {
        return value;
    }

    public void addCoins(int addedAmount) {
        amount += addedAmount;
    }

    public void removeCoins(int removedAmount)
    {
        if(amount >= removedAmount)
        {
            amount -= removedAmount;
        }
        else
            System.out.println("Not enough coins");
    }

    public int getCoinsAmount() {
        return amount;
    }

    public double getTotalValue() {
        return amount * value;
    }
}