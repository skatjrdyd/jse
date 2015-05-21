package oop01.systax;

public class CardVO {
	private String kind; // 카드의 무늬 / 인스턴스 변수
	private int number; // 카드의 숫자 / 인스턴스 변수
	static int width = 150; // 카드의 너비 / 클래스 변수
	static int height = 300; // 카드의 높이 /클래스 변수
	public CardVO() {
		
	}
	public CardVO(String kind, int number){
		this.kind = kind;
		this.number = number;
		
	}
	public String getKind(){
		return kind;
	}
	public CardVO(String kind, int number){
		System.out.println("당신 카드의 무늬는 " + kind + "이며" 
				            + " 당신 카드의 숫자는 " + number + "이다");
	}
	public void setKind(String kind){
		this.kind = kind;
	}
}
