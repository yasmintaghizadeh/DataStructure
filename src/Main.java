import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        int[] ints=new int[]{1,5,9,16,27,36,54};
//        int[] ints1=new int[]{1,10,2,16,100,3,54};
//       int result= DataStructureSearch.binarySearch(ints,20);
//        System.out.println(result);
//        int result2= DataStructureSearch.binarySearchRecursive(ints,27,ints.length-1,0);
//        System.out.println(result2);
//
//        int result3= DataStructureSearch.linearSearch(ints,27);
//        System.out.println(result3);
//
////       DataStructureSort.mergeSort(ints1,0,6);
////       DataStructureSort.display(ints);
////
////       DataStructureSort.insertionSort(ints1);
////       DataStructureSort.display(ints1);
////
////       DataStructureSort.selectionSort(ints1);
////       DataStructureSort.display(ints1);
//
//        DataStructureSort.bubbleSort(ints1,ints1.length);
//        DataStructureSort.display(ints1);
        MyListArray<Integer> integers=new MyListArray<>();
        integers.add(25);
        System.out.println(integers.get(10));
        integers.remove(5);
        System.out.println(integers.toString());


    }


}
