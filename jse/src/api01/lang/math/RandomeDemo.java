package api01.lang.math;

import java.util.Scanner;

/*
 * java.lang.Math 에 있는
 * random() 메서드는 난수를 발생시킨다
 * */
public class RandomeDemo {
	public static void main(String[] args) {
		int com =  (int) (Math.random()*5)+1; //앞의 3은 limit,  뒤의 1은 begin
		int myVal = 0;
		Scanner scanner =  new Scanner(System.in);
		int i = 0;
		while(true){
			System.out.println("1부터 5까지의 임의의 숫자를 입력하세요");
			i++;
			System.out.println(i+ "번째 입력 : ");
			myVal = scanner.nextInt();
			if(myVal == com){
				System.out.println("컴난수 : " + com);
				System.out.println("정답입니다");
				break; // while(true) 로 주면 무한루프를 돈다.
				// 무한 루크에서 break;를 걸어야 한다.
			}
			if(i==3){
				System.out.println("실패");
			}break;  //횟수를 3회로 제한
		}
 }
}
