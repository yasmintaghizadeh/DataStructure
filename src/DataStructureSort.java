public class DataStructureSort {

        private static void merge(int[] ints, int firsIndex,int middleIndex,int lastIndex) {
        int leftLength = middleIndex-firsIndex+1;
        int rightLength = lastIndex - middleIndex;

        int[] left = new int[leftLength];
        int[] right = new int[rightLength];

        for (int i = 0; i < leftLength; i++) {
            left[i] = ints[i];
        }

        for (int i = 0; i < rightLength; i++) {
            right[i] = ints[middleIndex + i];

        }
        int i = 0, j = 0, k = 0;
        while (i < leftLength && j < rightLength) {
            if (left[i] < right[j]) {
                ints[k] = left[i];
                i++;
            } else {
                ints[k] = right[j];
                j++;

            }
            k++;
        }
        while (i < leftLength) {
            ints[k] = left[i];
            i++;
            k++;
        }
        while (j < rightLength) {
            ints[k] = right[j];
            j++;
            k++;
        }
    }

    public static void display(int arr[])
    {
        for (int i=0; i<arr.length; ++i)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int[] ints, int firstIndex, int lastIndex) {
        if (firstIndex < lastIndex) {
            int middleLength = (lastIndex + firstIndex) / 2;
            mergeSort(ints, firstIndex, middleLength);
            mergeSort(ints, middleLength + 1, lastIndex);
            merge(ints,firstIndex,middleLength,lastIndex);

        }
    }
     public static void insertionSort(int [] ints){
         for (int i = 1; i < ints.length-1; i++) {
             int temp=ints[i];
             int j =i-1;
             while (temp<=ints[j] && j>=0){
                 ints[j+1]=ints[j];
                 j--;
             }
           ints[j+1]=temp;
             }
         }

         public static void selectionSort(int [] ints){
             int temp;
             int pos;
             for (int i = 0; i < ints.length-1; i++) {
                 pos=i;
                 for (int j = i+1; j < ints.length; j++) {
                     if (ints[j]<ints[pos]) {
                         pos = j;
                     }
                         temp=ints[pos];
                         ints[pos]=ints[i];
                         ints[i]=temp;
                     }
                 }
             }

          public static void bubbleSort(int [] ints,int n){
            if (n==1){
                return;
            }
              for (int i = 0; i <n-1 ; i++) {
                  if (ints[i]<ints[i+1]){
                      int temp=ints[i];
                      ints[i]=ints[i+1];
                      ints[i+1]=temp;
                  }
              }
              bubbleSort(ints,n-1);

        }

}



