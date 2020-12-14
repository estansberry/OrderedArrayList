import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
    NoNullArrayList<T> newarr = new NoNullArrayList<T>();
  }
  public OrderedArrayList(int size){
    super();
    NoNullArrayList<T> newarr = new NoNullArrayList<T>(size);
  }
  public boolean add(T a){
    int i = 0;
    while (i < size() && a.compareTo(get(i)) > 0){
      i++;
    }super.add(i, a);
    return true;
  }
  public void add(int index, T a){
    add(a);
  }
  public T set(int index, T a){
    T y = null;
    if(super.size() != 0){
      y = super.get(index);
    }super.remove(index);
    add(a);
    return(y);
  }
}
