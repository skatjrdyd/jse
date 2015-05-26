package oop01.encapusle;

public class PayD {
	public static void main(String[] args) {
		String hulk = "헐크";
		String iron = "아이언";
		String thor = "토르";
		
		int hulksalary = 200;
		int ironsalary = 300;
		int thorsalary = 500;
		
		
		double hulktax = hulksalary * 0.1;
		double irontax = ironsalary * 0.1;
		double thortax = thorsalary * 0.1;
		
		int hulkincome = hulksalary - (int)hulktax;
		int ironincome = ironsalary - (int)irontax;
		int thorincome = thorsalary - (int)thortax;
			
		PayA hulkPay = new PayA();
		hulkPay.setTaxVal(hulksalary);
		hulkPay.setIncome(hulkincome);
		PayA ironPay = new PayA();
		ironPay.setTaxVal(ironsalary);
		ironPay.setIncome(ironincome);
		PayA thorPay = new PayA();
		thorPay.setTaxVal(thorsalary);
		thorPay.setIncome(thorincome);
		System.out.println("=== " + hulk + "의 5월 급여내역 ===");
		System.out.println("급여 : " + hulksalary);
		System.out.println("세금 : " + hulkPay.getTax());
		System.out.println("실수령액 : " + hulkPay.getIncome());
		System.out.println();
		System.out.println("=== " + iron + "의 5월 급여내역 ===");
		System.out.println("급여 : " + ironsalary);
		System.out.println("세금 : " + ironPay.getTax());
		System.out.println("실수령액 : " + ironPay.getIncome());
		System.out.println();
		System.out.println("=== " + thor + "의 5월 급여내역 ===");
		System.out.println("급여 : " + thorsalary);
		System.out.println("세금 : " + thorPay.getTax());
		System.out.println("실수령액 : " + thorPay.getIncome());
		System.out.println();
	}
}
