 // wrap to check array is palindromic or not ..........
public class Palindromic {

    public static void main(String[] args) {

        int[] array = {1,2,3,2,1,5};
        int n = array.length;
        int flag =0;

        for (int i=0; i<n/2; i++){

            if (array[i] != array[n-i-1]){
                System.out.println("Not Palindromic Array: ");
                flag = 1;
            }
            break;
        }
        if (flag == 0){
            System.out.println("Palindromic array:");
            System.out.println("Flag is = "+flag);
        }
    }

}
