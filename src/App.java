public class App {

   public static void main(String[] args) {

      // Example use of findIndex() Method.
      int[] arr = {-123, -23, -1, 0, 12, 23, 34, 45, 56, 67, 78, 89, 90, 101, 123, 234, 345, 456, 567};
      int index = findIndex(34, arr);
      System.out.println(index);

   }


   // findIndex() Method:
   //    It carries out the binary search.
   //    It returns the index of the given number.
   //    If the given number is not in the array, it returns -1.
   //    The array needs to pe sorted.
   //       Parameters:
   //       number - the number, we want to get index of.
   //       arr - the array, we want to search through.

   static int findIndex(int number, int[] arr) {
      int firstIndex = 0;
      int lastIndex = arr.length - 1;
      int middleIndex;

      while(firstIndex <= lastIndex) {
         middleIndex = (firstIndex + lastIndex) / 2;

         if(arr[middleIndex] == number)
            return middleIndex;
         else if(arr[middleIndex] > number)
            lastIndex = middleIndex - 1;
         else
            firstIndex = middleIndex + 1;
      }

      return -1;
   }

}
