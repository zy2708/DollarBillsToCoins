import javax.swing.JOptionPane;

public class DollarBillsToCoins
{
    public static void main(String[] args)
    {
        final int TENDOLLARBILL=1000;
        final int FIVEDOLLARBILL=500;
        final int ONEDOLLARBILL=100;
        final int QUARTER=25;
        final int DIME=10;
        final int NICKLE=5;
        final int PENNY=1;

        String tendollarinput=JOptionPane.showInputDialog("Enter your amount of 10 dollar bills");
        String fivedollarinput=JOptionPane.showInputDialog("Enter your amount of 5 dollar bills");
        String onedollarinput=JOptionPane.showInputDialog("Enter your amount of 1 dollar bills");

        int dollarsoftenbills= Integer.parseInt(tendollarinput );
        int dollarsoffivebills= Integer.parseInt(fivedollarinput );
        int dollarsofonebills= Integer.parseInt(onedollarinput );

        int tendollarbillstocents=dollarsoftenbills*TENDOLLARBILL;
        int fivedollarbillstocents=dollarsoffivebills*FIVEDOLLARBILL;
        int onedollarbillstocents=dollarsofonebills*ONEDOLLARBILL;
        int amountofcents=tendollarbillstocents+fivedollarbillstocents+onedollarbillstocents;

        JOptionPane.showMessageDialog(null,"Your have multiple chocies to change your bills to coins "
                +"\n"+"Choice 1: "+amountofcents/QUARTER+" quarters "
                +"\n"+"Choice 2: "+amountofcents/DIME+" dimes "
                +"\n"+"Choice 3: "+amountofcents/NICKLE+" nickles "
                +"\n"+"Choice 4: "+amountofcents/PENNY+" pennies ");

    }

}
