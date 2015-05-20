package oop01.systax;

public class PayA {
	private String name;
	private int salary; //급여
	public static final double tax=0.1; //세율 0.1  --->상수
	private int taxVal;
	private int income; //실급여 = salary - salary*0.1
	
	public void setTaxVal(int salary){
		System.out.println("PayA 에 넘어온 파라미터 값 : " + salary);
		this.taxVal = (int)(salary * tax);
	}
	public void setIncome(int salary){
		this.income = (int) (salary-salary*0.1);
		
	}
	public int getTax(){
		return (int)taxVal;
	}
	public int getIncome(){
		return income;
	}
}
/*
 객체지향의 4대 특징
 1. 은닉화(encapsulation) : getter(read의 역할) : 필드에 있는 값을 읽어오겠다, setter(write역할) : 필드에다가 값을 저장
 2. 상속(inhabitance)
 3. 추상화(implement)
 4. 다형성(polymorphism) 
 
 * */
