package User;

import Designer.Dictionary;
import Designer.DictionaryItem;

public class BankAccApp {

  public static void main(String[] args) {
    Dictionary d = new Dictionary();

    BankAccount anirut = new BankAccount("0002", "Anirut", 1000);
    BankAccount somrak = new BankAccount("0456", "Somrak", 2000);
    BankAccount pongsak = new BankAccount("0383", "Pongsak", 3000);
    BankAccount niwat = new BankAccount("0139", "Niwat", 4000);

    d.insert(anirut);
    d.insert(somrak);
    d.insert(pongsak);
    d.insert(niwat);

    d.display();

    String searchID = "0383";
    DictionaryItem foundBankAccount = d.find(searchID);
    if (foundBankAccount != null) {
      System.out.println("Found " + foundBankAccount);
    }
    else {
      System.out.println("Can't find " + searchID);
    }
        
    double amount = 5000;
    System.out.println("Deposit " + amount + " baht to acc no:" + searchID);
    ((BankAccount) foundBankAccount).deposit(amount);
    d.display();
       

    System.out.println("Delete 0383");
    boolean delSuccessful = d.delete("0383");

    if (!delSuccessful) {
      System.out.println("Nothing is deleted!");
    }
    d.display();

  }

}