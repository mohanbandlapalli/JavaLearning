package generic;

import java.util.Arrays;

public class GenericList<T> {

   private T[] items = (T[]) new Object[10];
   private int count;

   public void add(T item){
       items[count++] = item;
   }

   public T get(int index){
       return items[index];
   }

    @Override
    public String toString() {
        return "GenericList{" +
                "items=" + Arrays.toString(items) +
                ", count=" + count +
                '}';
    }
}
