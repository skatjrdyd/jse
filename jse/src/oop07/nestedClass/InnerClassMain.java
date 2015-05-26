package oop07.nestedClass;

public class InnerClassMain {
	public static void main(String[] args) {
		InnerClassMain inn = new InnerClassMain();
	//	inn.getInnerClassInstance();  인스턴스 내부클래스 호출시
		inn.getInnerClassLocal();
		
	}/*
	 내부 클래스 형태 중 첫번째인 인스턴스 내부클래스 호출 방법
	*/
	public void getInnerClassInstance(){
		InnerClassInstance.Inner inner = new InnerClassInstance().new Inner();
		inner.printData();
	}
	public void getInnerClassStatic(){
		InnerClassStatic.Inner inner = new InnerClassStatic.Inner();
		inner.pirntData();
	}
	public void getInnerClassLocal(){
		InnerClassLocal outer = new InnerClassLocal();
		outer.innerTest(1000);
	}
}
