package api01.lang.object;

public class EqualsDemo {
	public static void main(String[] args) {
			Temp t1 = new Temp(10);
			Temp t2 = new Temp(10);
			// 지역변수는 반드시 초기화를 해야한다.
			// 특정한 값이 필요하지 않는 경우는 default을 할당한다.
			
			String result = "";
			/*
			 3항 연산자
			 리턴값 = (조건식) ? "참인 경우" : "거짓인 경우";
			 * */
			result = t1.equals(t2) ? "t1 과 t2는 동일" : "t1 과 t2는 다름";
			System.out.println("생성자를 통해 생성된 참조변수 값의 비교 : " + result);
			
			t2 = t1; // 참조변수 t2 에다가 t1의 값을 할당하라는 뜻
			result = t1.equals(t2) ? "t1 과 t2는 동일" : "t1 과 t2는 다름";
			System.out.println("참조변수 값을 다른 참조변수값에 할당시"
					+ "참조변수 값의 비교 : " + result);
	}
}
class Temp{
	int num;
	public Temp(int num) {
		this.num = num;
	}
}