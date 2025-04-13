// wrap to reverse array
public class ReverseArray {

   public static void main(String[] args){
       int[] array = {10,1,2,3,4,5};
       int n = array.length;
       int temp =0;

       for (int i= 0; i<n/2; i++){
           /* swap the element between array[i] and array[n-i-1] with
           the help of temp 3rd variable */

           temp = array[i];
           array[i] = array[n-i-1];
           array[n-i-1] = temp;

       }
       System.out.println("Reversal of Array:");
       for (int i=0; i<n; i++){
           System.out.print(array[i]+ " ");
       }
       System.out.println();
   }
}
