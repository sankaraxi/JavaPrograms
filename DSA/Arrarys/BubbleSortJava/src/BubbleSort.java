import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={9,4,2,5,1,7,3,0,6,8};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        //runs the steps n - 1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false; //optimization which will help to stop the program if the array is already sorted
            //for each step max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]){
                    //swap
                     int temp = arr[j];
                     arr[j] = arr[j-1];
                     arr[j-1] = temp;
                     swapped = true;
                }
            }
            //if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped){
                break;
            }
        }
    }
}