import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
    ArrayList<T> newarr = new ArrayList<T>();
  }
  public OrderedArrayList(int size){
    super();
    ArrayList<T> newarr = new ArrayList<T>(size);
  }
  public boolean add(T a){
    for(int i = 0; i < size(); i ++){
      if(a.compareTo(super.get(i)) >= 0){
        super.add(a);
      }
    }return(true);
  }
  public void add(int index, T a){
    add(a);
  }
  public T set(int index, T a){
    T x = super.get(index);
    super.remove(index);
    add(a);
    return(x);
  }
}
