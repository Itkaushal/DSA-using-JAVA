// wrap to check array is palindromic or not? Practice...first approach
public class Palindrom {

    public static void main(String[] kaushal){

     int array[] = {1,3,5,3,1};
     int n = array.length;
     int flag =0;
     for (int i=0; i<n/2; i++){
         if (array[i] != array[n-i-1]){
             System.out.println("Array is not Palindromic:");
             flag =1;
             break;
         }
     }

     if (flag == 0){
         System.out.println("Array is Palindromic!");
     }

    }
}

//  Time Complexity = O(n)
//  Space Complexity = O(1)


