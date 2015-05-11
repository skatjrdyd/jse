package cmm01.var;
/*
 Date : 2015.05.11
 Author : 남석용
 Description : 캐스팅 문법에 대한 학습자료
 * */
class CastingDemo {
	public static void main(String[] args) {
/*
 Up-Casting
 변환(Conversion)
 * promotion
 * 일시적(Implicit) 자동변환
 자동형 변환은 데이터 타입의 표현범위가 작은쪽에서 많은쪽으로 변환이 될때만 가능하다.
 byte->short->int->long->float->double, float와 double을 구별할 때 선언시 float 수 뒤에 f붙인다
 char->int
 * */		
		byte varByte = 1;    //초기화, 선언+할당
		int varInt = 123;
		double varDouble = 123.456;
		
		int upByte = (int) varByte; /*
		                             괄호문법 int upByte; 선언
		                                      upByte = varByte       메모리가 작은거에서 큰 걸로 넣을 때는 괄호(int)생략가능
		                                      큰 거에서 작은거로 바뀔때는..?
		                             */
		double upByte2 = varByte;
		double upInt = varInt;

		
		
		System.out.println("Hello Java!!");
		
		/*
		Down Casting(그냥 캐스팅)
		*강제형 변환
		 프로그램에서 명시적(explicit)으로 지정하는 타입변환
		 축소변환이 되는 경우에는 반드시 명시적으로 캐스팅하여야 한다.
		 단, 데이터 손실이 발생할 수 있다.
			 *  */
			double varDou = 123.456;
			int varInt2 = 1;
		//  int downByte = (int) varDou;
			byte varB2 = (byte) varInt2;
			float varF = 123.456f;
			int varInt3 = (int) varF;
			System.out.println("varInt3 값 : " + varInt3);
	}
	
	

	
}		



