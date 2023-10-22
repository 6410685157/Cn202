package User;
import Designer.DictionaryItem;

public class BankAccount implements DictionaryItem {
  private String accNumber; // key of BankAccount object
  private String accName;
  private double balance;
    
  public BankAccount(String accNumVal, String accNameVal, double balVal) {
    accNumber = accNumVal;
    accName = accNameVal;
    balance = balVal;
  }
  public void deposit(double amount) {
    balance += amount;
  }
  public void withdraw(double amount) {
    balance -= amount;
  }
  public String getAccNumber() {
    return accNumber;
  }
  public String getAccName() {
    return accName;
  }
  public double getBalance() {
    return balance;
  }
  public Object getKey() {
    return accNumber;
  }
  public String toString() {
    return "acc no = " + accNumber + ", acc name = " + accName +
           ", balance = " + balance;
  }
  public int compareTo(Object keyAccNum) {
    return accNumber.compareTo((String) keyAccNum);
  }
}