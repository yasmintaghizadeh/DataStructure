public class DataStructureSearch {


    public static int binarySearch(int[] ints, int input) {
        int lastIndex = ints.length - 1;
        int firstIndex = 0;
        while (lastIndex >= firstIndex) {
            int middleIndex = (lastIndex + firstIndex) / 2;

            if (ints[middleIndex] == input) {
                return middleIndex;

            }
            if (ints[middleIndex] < input) {
                firstIndex = middleIndex + 1;
            } else
                lastIndex = middleIndex - 1;

        }
        return -1;

    }

    public static int binarySearchRecursive(int[] ints, int input, int lastIndex, int firstIndex) {

        if (lastIndex >= firstIndex) {
            int middleIndex = (lastIndex + firstIndex) / 2;

            if (ints[middleIndex] == input)
                return middleIndex;

            if (ints[middleIndex] <input)
                return binarySearchRecursive(ints, input, lastIndex , middleIndex+1);
            if (ints[middleIndex] > input)
            return binarySearchRecursive(ints, input, middleIndex - 1, firstIndex);
        }
        return -1;
      }

      public static int linearSearch(int[] ints, int input){
          for (int i = 0; i < ints.length-1; i++) {
              if (ints[i] == input)
                  return i;
          }
          return -1;
      }


    }


