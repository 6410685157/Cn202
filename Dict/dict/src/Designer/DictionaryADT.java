package Designer;

public interface DictionaryADT
{
  // find and return the item with the desired key
  // return null if not found
  public DictionaryItem find(Object key);

  // insert a dictionary item into the dictionary
  public void insert(DictionaryItem item);

  // remove the item with the desired key
  // return true if the deletion can be done
  // return false if the dictionary has no such item
  public boolean delete(Object key);

  // display all items in the dictionary
  public void display();
  public boolean removeMaxKeyItem(); 
}