package piggybank;

import java.util.*;
import java.text.DecimalFormat;

public class Main
{
    public static void subtract( ArrayList<Coin> coins, double amount)
    {
       double removed = 0.0;
       double difference = 0.0;
       int n = 0; //amount to be removed
       for(Coin c: coins)
       {
           if(removed < amount)
           {
               if(removed + c.getTotalValue() <= amount)
               {
                   removed += c.getTotalValue();
                   c.removeCoins(c.getCoinsAmount());
               }

               else
               {
                    difference = amount - removed;
                    if(difference >= c.getValue())
                    {
                        n = (int) Math.round(difference/c.getValue());
                        c.removeCoins(n);
                        removed += n*c.getValue();
                    }
                    difference = 0.0;
                    n = 0;
               }
           }
       }

       for(int i = coins.size()-1; i>=0; i--)
       {
        System.out.println(coins.get(i).toString());
           if (coins.get(i).getCoinsAmount() == 0)
           {
               System.out.println(coins.get(i).toString());
               coins.remove(i);
           }
       }
       System.out.println("**** Piggy Bank ****");
        System.out.println(coins.toString());
    }
    public static void main (String[] args)
    {
        ArrayList<Coin> piggyBank = new ArrayList<Coin>();

        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        System.out.println("**** Piggy Bank ****");
        System.out.println(piggyBank.toString());

        double piggyBankTotal = 0.0;
        
        for (Coin c : piggyBank)
        {
            piggyBankTotal += c.getTotalValue();
        }

        DecimalFormat fp = new DecimalFormat("$###,###.00");

        System.out.println();
        System.out.println("The piggy bank holds " + fp.format(piggyBankTotal));

        System.out.println();
        subtract(piggyBank, 1.50);

    }
}