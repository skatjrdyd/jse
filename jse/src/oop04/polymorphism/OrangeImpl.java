package oop04.polymorphism;

public class OrangeImpl implements FruitInterface{

	
	public void display(String s) {
		System.out.println(s + " 오렌지입니다.");
	}
	public int getCount(){
		return 100;
	}
}
