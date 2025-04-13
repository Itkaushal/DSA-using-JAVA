// wrap to find out missing element in to array? Practice.........
public class MissingElement {

    public static void main(String[] Ramm){
        int array[] = {1,4,3,5,6,7,2,10,8};
        int n= array.length;

        // sum of natural number
        int sum_nat_num = ((n+1)*(n+2)/2);

        // sum of element in to array
        int sum = 0;
        for (int i=0; i<n; i++){
            sum+= array[i];
        }

        // missing element in to array is
        int missing_ele = 0;
        missing_ele = sum_nat_num - sum;
        System.out.println("Missing Element is: "+ missing_ele);
    }
}
