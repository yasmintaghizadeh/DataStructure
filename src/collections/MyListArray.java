package collections;

import java.util.Arrays;

public class MyListArray<E> {

    private static int DEFAULT_CAPACITY = 10;
    private Object[] arr;
    private int index = 0;
    private int size = DEFAULT_CAPACITY;

    public MyListArray() {
        arr = new Object[DEFAULT_CAPACITY];
    }

    public void add(Object element) {
        if (index == arr.length-1) {
            extendedArray();
        }
        if (arr[index] == null && index < arr.length) {
            arr[index] = element;
            index++;

        }

    }

    public void extendedArray() {
            size = size * 2;
            Object[] arrExtended = new Object[size];
            for (int i = 0; i < arr.length; i++) {
                arrExtended[i]=arr[i];
            }
            arr = arrExtended;
        }

    public void shiftArray(int index){
            if (arr[index]==null){
                arr[index]=arr[index+1];
            }
    }

    public Object get(int index){
        if (index< arr.length) {
            return arr[index];
        }
        return null;
    }


   public void remove(int index){
        arr[index]=null;
        shiftArray(index);
   }

    @Override
    public String toString() {
        return "collections.MyListArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}

