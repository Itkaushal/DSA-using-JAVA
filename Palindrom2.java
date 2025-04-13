import java.util.Arrays;

// wrap to check array is palindromic or not ? Second Approach Practice
public class Palindrom2 {
    public static void main(String[] args){

        int[] array = {1,9,3,2,1};
        int n = array.length;

        boolean isPalindromic = true;

        int newArray[] = Arrays.copyOf(array,array.length); // copy original array

        for (int i=0; i<n/2; i++){
            if (array[i] != array[n-i-1]){
                isPalindromic = false;
                break;
            }
        }

        boolean isSameArray = Arrays.equals(array,newArray);

        if (isSameArray && isPalindromic){
            System.out.println("Array is Palindromic!");
        } else {
            System.out.println("Array is not Palindromic");
        }
    }
}

