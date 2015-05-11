package cmm01.var;
class Var {
	 public static void main(String[] args) {
		 /*
		  * 변수의 8가지 종류
		  * 문자 타입 : char
		  * 숫자 타입(정수 타입) : byte, short, int, long 
		  * 숫자 타입(실수 타입/소숫점이하가 존재하는 수) : float, double
		  * 논리 타입 : boolean
		  * */ 
		 int x;  // 변수의 선언
		 
		 x = 1; // 할당연산자를 이용한 값을 할당(대입)
		 
		 int y;
		 
		 y = x + 1;
		 
		 System.out.println(y);
		 /*
		  * 더블 쿼터 내부에 쓰인 문자열은 콘솔창에 그대로 출력하고
		  * 변수명 그대로 사용되는 것은 내부에 할당된 값(value)이 출력된다*/
		 System.out.println("x+1의 값 : "+y);
	} 
}