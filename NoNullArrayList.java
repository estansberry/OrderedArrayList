import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList(){
    super();
    ArrayList<T> newarr = new ArrayList<T>();
  }
  public NoNullArrayList(int size){
    super();
    ArrayList<T> newarr = new ArrayList<T>(size);
  }

  public boolean add(T a){
    if(a == null){
      throw new IllegalArgumentException();
    }else{
      super.add(a);
    }
    return(true);
  }

  public void add(int index, T a){
    if(a == null){
      throw new IllegalArgumentException();
    }else{
      super.add(index, a);
    }
  }

  public T set(int index, T a){
    T x = super.get(index);
    if(a == null){
      throw new IllegalArgumentException();
    }else{
      super.set(index, a);
    }
    return(x);
  }
}
