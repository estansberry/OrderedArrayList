import java.util.ArrayList;
NoNullArrayList<T> extends ArrayList<T> {
  public void add(Object a){
    if(a == null){
      throw new IllegalArgumentException();
    }else{
      T.add(a);
    }
  }
  public void add(int index, Object a){
    if(a == null){
      throw new IllegalArgumentException();
    }else{
      T.add(index, a);
    }
  }

  public void set(int index, Object a){
    if(a == null){
      throw new IllegalArgumentException();
    }else{
      T.set(index, a);
    }
  }
}
