package Account;

public class SavingsAccount extends Account{
    private double interestRate;
    public SavingsAccount(int idNumber, double startBal, double ir) {
        super(idNumber, startBal);
        // TODO Auto-generated constructor stub
        interestRate = ir;
    }
    public double monthlyInterest() {
        return currentBalance()*interestRate/12;
    }
    public void withdraw(double bal){
        if(bal<currentBalance())
            decreaseBalance(bal);
    }
}
