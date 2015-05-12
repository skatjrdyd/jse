package cmm02.op;

public class No02_2HangDemo {
	public static void main(String[] args) {
		int x = 20, y = 7;  //같은 타입이면 쉼표하고 다음 변수
		int add = 0, sub = 0, gob = 0, mok = 0, nmg = 0;
		
		add = x + y;    //항이 두 개라서 2항연산자(x항과 y항)
		sub = x - y;
		gob = x * y;
		mok = x / y;    // 슬러쉬를 쓰면 몫만 준다
		nmg = x % y;    // %쓰면 나머지 값을 준다.
		
		//리턴값
		
		System.out.println("x + y 의 결과값 : " + add);
		System.out.println("x - y 의 결과값 : " + sub);
		System.out.println("x * y 의 결과값 : " + gob);
		System.out.println("x / y 의 결과값 : " + mok);
		System.out.println("x % y 의 결과값 : " + nmg);
		
		
}
}
