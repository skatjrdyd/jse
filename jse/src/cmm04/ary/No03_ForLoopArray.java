package cmm04.ary;

public class No03_ForLoopArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		for(int i = 1;i<arr.length;i++){
			sum += arr[i];
		}
		System.out.println("배열 원소의 합은 " + sum);
	}
}
