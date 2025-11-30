package Solutions;

import java.util.Arrays;

public class ReverseSectionOfArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		reverse(arr,0,2);
		System.out.println(Arrays.toString(arr));
	}

	static void reverse(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}