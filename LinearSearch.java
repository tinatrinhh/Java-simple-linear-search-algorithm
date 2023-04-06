
public class LinearSearch {
// method for linear search 
	public static void main(String[] args) {
		int[] arr = {64, 34, 25, 12, 22, 11, 90}; 
		
		int x = 22;
		
        int result = linearSearch(arr, x);
        if (result == -1) {
            System.out.print(
                "Element is not present in array");}
        else {
            System.out.print("Element is present at index " + result);
    }
	}
	
	
	public static int linearSearch(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) 
                return i;
        }
        return -1;
	}
}
