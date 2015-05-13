package cmm03.flow;

import java.util.Scanner;   //scanner 컨트롤 스페이스 하니 이게 생김

public class No02_IfElseDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("값을 입력하세요..");
		/*int i;
		i = 0;*/
		int i = 0;
		i = scanner.nextInt();
		System.out.println("입력값은 " + i + "입니다.");
				
	}
}
//대문자 Scanner 를 클래스, 즉 대문자로 시작하는 것들은 모두 class             
//객체 : 어떤 식을 하나의 값을 매겨서 나중에 필요할 때 그 값을 선언(호출)하면 그 식을 다 쓸 필요없고 똑같이 쓸 수 있음.
