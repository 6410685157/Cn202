package Designer;

public interface DictionaryItem
{
   // print information of the dictionary item
   public String toString();

   // return the key of the dictionary item
   public Object getKey();

   // compare the key of this object item with otherKey
   // returns value >, ==, < 0 if the key of this object
   // is >, equals, is < keyK
   public int compareTo(Object keyK);
}