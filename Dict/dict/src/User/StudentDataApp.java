package User;

import Designer.Dictionary;
import Designer.DictionaryItem;

public class StudentDataApp
{
  public static void main(String[] args)
  {
    Dictionary d = new Dictionary();

    Student anirut = new Student("0002", "Anirut");
    Student somrak = new Student("0456", "Somrak");
    Student pongsak = new Student("0383", "Pongsak");
    Student niwat = new Student("0139", "Niwat");

    d.insert(anirut);
    d.insert(somrak);
    d.insert(pongsak);
    d.insert(niwat);

    d.display();

    String searchID = "0383";
    DictionaryItem foundStudent = d.find(searchID);
    if (foundStudent != null)
    {
      System.out.println("Found " + foundStudent);
    }
    else
      System.out.println("Can't find " + searchID);

    System.out.println("Delete 0383");
    boolean delSuccessful = d.delete("0383");

    if (!delSuccessful)
      System.out.println("Nothing is deleted!");
    d.display();
    System.out.println("this is max key : " + d.getMaxKay());
    d.removeMaxKeyItem();
    d.display();
  }
}