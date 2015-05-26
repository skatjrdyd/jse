package oop07.nestedClass;

public class InnerClassAnonyServiceImpl {
	String data = "Hello Anonymous World !!";
	public void print(){
		new InnerClassAnonyService(){

			public void printData() {
				System.out.println("익명 내부클래스 출력 : "  + data);
				
			}
			
		}.printData();
	}
}
