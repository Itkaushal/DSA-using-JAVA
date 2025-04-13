// wrap to print Reversal Array ? Practice.......
public class ReversalArray2 {

    public static void main(String[] Raam) {

        int[] array = {1, 3, 5, 8, 10};
        int n = array.length;
        int temp = 0;


        for (int i=0; i<n/2; i++){

            // swap element between arr[i] and arr[n-i-1] with the help of temp var

            temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;

        }

        System.out.println("Reversal Array is :");

        for (int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}
