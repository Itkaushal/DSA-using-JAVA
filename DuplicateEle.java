// wrap to find out duplicate element in to array?
public class DuplicateEle {

    public static void main(String[] Raam){

        int[] arr = {1,2,9,8,2,6,50};
        int n = arr.length;
        // we use two for loop....
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if (arr[i] == arr[j]){
                    System.out.println("Duplicate Element is: "+arr[i]);
                }
            }
        }
    }
}

// Time Complexity = O(n^2)
// Space Complexity = O(1)
