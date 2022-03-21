package Account;

public class SpecialCheckingAccount extends CheckingAccount{

    private double interestRate;
    private double minbal;

    public SpecialCheckingAccount(int idNumber, double startBal, double cc, double ir, double mb ) {
        super(idNumber, startBal, cc);
        interestRate = ir;
        minbal = mb;
    }
    public void clearCheck(double amount) {
        if(currentBalance()>minbal)
            decreaseBalance(amount);
        else super.clearCheck(amount);
    }
    public double monthlyInterest() {
        if(currentBalance()>minbal)
            return currentBalance()*interestRate/12;
        else return super.monthlyInterest();
    }
}
