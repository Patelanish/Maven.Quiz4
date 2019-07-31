package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {

    private Double workingHours;
    private Double hourlyWage;
    private BankAccount bankAccount;


    public Employee() {
        bankAccount = new BankAccount();
        hourlyWage = 35.0;
        workingHours = 0.0;
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        workingHours = 0.0;
        hourlyWage = 35.5;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;

    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        bankAccount.deposit((amountToIncreaseBy));

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        bankAccount.deposit(amountToDecreaseBy);

    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        workingHours += numberOfHours;

    }

    @Override
    public Double getHoursWorked() {
        return workingHours;
    }

    @Override
    public Double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return hourlyWage + workingHours;
    }
}
