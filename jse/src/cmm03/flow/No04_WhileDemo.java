package cmm03.flow;

public class No04_WhileDemo {
	public static void main(String[] args) {
		int count = 1;            //이번 예제같은 경우 0번의 회전은 상식적으로 말이 안되서 default값이 아닌 1로 시작, 무조건 default로는 하지말기.
		while (count < 11) {
			System.out.println("회전수는 "
					+ count + "번입니다.");
			count++;
		}
	}
}
