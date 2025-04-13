// wrap to find out missing element in to given array?
public class MissingEle {

    public static void main(String[] Raam){

        int[] arr = {1,2,4,7,6,5};
        int n= arr.length;

        // sum of natural number
        int sum_natural_num = ((n+1)*(n+2)/2); // n(n+1)/2 ! here n is n+1 so

        // sum of element in to array
        int sum = 0;
        for (int i=0; i<n; i++){
            sum+= arr[i];
        }

        //  missingElement in to array
        int missingElement = 0;
        missingElement= sum_natural_num - sum;
        System.out.println("Missing Element in Array: "+missingElement);

    }
}
