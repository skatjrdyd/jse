package api01.lang.thread;

public class RunnableDemo {
	public static void main(String[] args) {
		Runnable r = new RunnableImpl();// 인터페이스 타입의 참조변수는 new 인터페이스를 구현한 클래스명(); 
		/*
		 * 생성자 Thread(Runnable target), 여기서는 위에 Runnable r 의 r
		 * */
		Thread thr = new Thread(r);
		thr.start();
	}
}
class RunnableImpl implements Runnable{

	
	public void run() {
		for(int i = 0; i<5; i++){
			System.out.println(
					Thread.currentThread().getName());
			/*
			 * 상속이 아니기 때문에, super()를 사용할 수 없다.
			 * */
		}
		
	}
}
