package maximum;

public class LocalMax {

    public static int localMax(int [] arr,int first,int last){
        int middleIndex=(first+last)/2;
        if (arr[middleIndex] > arr[middleIndex + 1] && arr[middleIndex]>arr[middleIndex-1]) {
            return arr[middleIndex];
        }else return localMax(arr,middleIndex+1,last);
    }
}
