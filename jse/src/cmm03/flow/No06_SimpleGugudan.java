package cmm03.flow;

import java.util.Scanner;

public class No06_SimpleGugudan {
	public static void main(String[] args) {
		int dan = 1;
		Scanner scanner = new Scanner(System.in);   //키보드 시스템은 system
		System.out.println("단을 입력하세요.");
		dan = scanner.nextInt();
		System.out.println("============");
		for(int i = 1 ; i<10 ; i++){
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}
}
