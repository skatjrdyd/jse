package oop07.nestedClass;

public class InnerClassAnonyHello {
	interface GreetingService{
		public void greet(String name);
	}
	public void sayHello(){
		/*
		 내부 클래스 인터페이스 구현 방법 1. 
		 * */
		class EnglishGreetServiceImpl implements GreetingService{

			public void greet(String name) {
				System.out.println("Hello " + name);
			}
			
		}
		GreetingService eng = new EnglishGreetServiceImpl();
		
		/*
		 내부 클래스 인터페이스 구현방법 2. 
		 	
		 * */
		GreetingService kor = new GreetingService() {
			
				
				public void greet(String name){
					System.out.println("안녕하세요." + name);
				}
		};
		eng.greet("Tom");
		kor.greet("톰");
	}
		public static void main(String[] args) {
			InnerClassAnonyHello greet = new InnerClassAnonyHello();
			greet.sayHello();
		}
}
