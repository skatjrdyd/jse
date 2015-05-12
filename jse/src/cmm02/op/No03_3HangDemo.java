package cmm02.op;

public class No03_3HangDemo {
	public static void main(String[] args) {
		int left = 1;
		int right = 0;
		int result = 0;
		boolean boo = true;
		result = boo ? left : right; //3항 연산자
		System.out.println("참이나 거짓이냐 1이면 참, 0이면 거짓: " + result);
	}
}
