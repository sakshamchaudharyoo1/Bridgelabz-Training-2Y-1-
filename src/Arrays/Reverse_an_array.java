package Arrays;

public class Reverse_an_array {
    public static void reverse(int [] arr,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]  = temp;

    }
}
