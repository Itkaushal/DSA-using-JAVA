// wrap to check array is palindromic or not practice
public class Palindrimic2 {
    public static void main(String[] args) {
        int flag =0;
        int array[] = {1,2,3,2,1};
        int n = array.length;

        for (int i=1; i<n/2; i++){
            if (array[i] != array[n-i-1]){
                System.out.println("Not Palendromic array!");
                flag = 1;
                break;
            }
        }
        if (flag == 0){
            System.out.println("Array is Palendromic and its and flag is : "+flag);
        }
    }
}
