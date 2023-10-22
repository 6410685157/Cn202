package Designer;

public class Dictionary implements DictionaryADT
{
  // using an unordered array to store
  // items in the dictionary
  private DictionaryItem[] a;
  private DictionaryItem[] New_a;
  private int nItems;

  // implementation of methods & constructors
public Dictionary(int max){
    a = new DictionaryItem[max];
    nItems = 0;
}
public Dictionary(){
    a = new DictionaryItem[100];
    nItems = 0;
}
public DictionaryItem find(Object key)
  {
    for (int j=0; j<nItems; j++)
      if (a[j].compareTo(key) == 0)
        return a[j];
    return null;
  }
// 1) insert with no exception (unlimit size)
//   public void insert(DictionaryItem item)
//   {
//     if (nItems == a.length - 1)
//         New_a = new DictionaryItem[2 * a.length];
//         for (int j = 0; j<nItems; j++)
//             New_a[j] = a[j];
//         a = New_a;
//     a[nItems] = item;
//     nItems++;
//   }

  public void insert(DictionaryItem item)
       throws DictionaryFullException
  {
    if (nItems == a.length)
      throw new DictionaryFullException("Dictionary is full.");
    a[nItems] = item;
    nItems++;
  }

  public boolean delete(Object key)
  {
    int j;
    for (j=0; j<nItems; j++)
        if (a[j].compareTo(key) == 0)
            break;
    if (j==nItems)
        return false;
    else
    {
      // item to be deleted is a[j]
      a[j] = a[nItems-1]; // move the last item to fill the gap
      nItems--;
      return true;
    }
  }

public DictionaryItem getMaxKay(){
DictionaryItem maxkey = a[0];
    if(nItems == 0){
        return null;
    }
    for (int i = 1; i <nItems; i++){
        if(a[i].compareTo(maxkey.getKey()) > 0){
            maxkey=a[i];
        }
    }
    return maxkey;
  }


  public boolean removeMaxKeyItem(){
    DictionaryItem maxkey = this.getMaxKay();
    int indexMaxKey = 0;
    if (nItems == 0){
        return false;
    }
    else{
        for (int i = 0; i < nItems; i++){
            if (a[i].compareTo(maxkey.getKey()) == 0){
                indexMaxKey = i;
            }
        }
        a[indexMaxKey] = a[nItems-1];
        nItems--;
        return true;
    }

    // Object maxk=a[0].getKey();
    // int max_idx=0;
    // if(nItems==0){
    //     return false;
    // }
    // else{
    //     for (int i = 1; i <nItems; i++) {
    //         if(a[i].compareTo(maxk)>0){
    //             maxk=a[i].getKey();
    //             max_idx=i;
    //         }
    //     }
    //     a[max_idx]=a[nItems-1];
    //     nItems--;
    //     return true;
    // }
  }
  public void display()
  {
    for(int j=0; j<nItems; j++)
      System.out.println(a[j]);
  }  
}