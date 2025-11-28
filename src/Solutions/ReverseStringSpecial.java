package Solutions;

public class ReverseStringSpecial {

	public static void main(String[] args) {
		String str = "a,b$c";
		System.out.println(reverse(str));
	}

	static String reverse(String str) {
		char[] arr = str.toCharArray();
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {

			if (!Character.isLetter(arr[left])) {
				left++;
			}

			else if (!Character.isLetter(arr[right])) {
				right--;
			}

			else {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}

		return new String(arr);
	}
}
