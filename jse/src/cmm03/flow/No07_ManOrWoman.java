package cmm03.flow;

import java.util.Scanner;

public class No07_ManOrWoman {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.");
		String ssn = scanner.nextLine();	
		char ch = ssn.charAt(7);  //이 method는 ssn의 7번째 숫자값을 뜻한다.
		if(ch == '1'){
			System.out.println("남자");    // 간단하게 하려면 or || 쓰자.
		}else if(ch == '2'){ 
			System.out.println("여자");    // case도 써보자
		}else if(ch == '3'){
			System.out.println("남자");
		}else if(ch == '4'){
			System.out.println("여자");
		}else{
			System.out.println("파악할 수 없습니다. 다시 입력하세요.");
		}
			

	}
}
