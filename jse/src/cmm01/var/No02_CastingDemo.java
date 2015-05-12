package cmm01.var;
/*
 Date : 2015.05.11
 Author : ������
 Description : ĳ���� ���� ���� �н��ڷ�
 * */
class No02_CastingDemo {
	public static void main(String[] args) {
/*
 Up-Casting
 ��ȯ(Conversion)
 * promotion
 * �Ͻ���(Implicit) �ڵ���ȯ
 �ڵ��� ��ȯ�� ������ Ÿ���� ǥ�������� �����ʿ��� ���������� ��ȯ�� �ɶ��� �����ϴ�.
 byte->short->int->long->float->double, float�� double�� ������ �� ����� float �� �ڿ� f���δ�
 char->int
 * */		
		byte varByte = 1;    //�ʱ�ȭ, ����+�Ҵ�
		int varInt = 123;
		double varDouble = 123.456;
		
		int upByte = (int) varByte; /*
		                             ��ȣ���� int upByte; ����
		                                      upByte = varByte       �޸𸮰� �����ſ��� ū �ɷ� ���� ���� ��ȣ(int)���
		                                      ū �ſ��� �����ŷ� �ٲ𶧴�..?
		                             */
		double upByte2 = varByte;
		double upInt = varInt;

		
		
		System.out.println("Hello Java!!");
		
		/*
		Down Casting(�׳� ĳ����)
		*������ ��ȯ
		 ���α׷����� �����(explicit)���� �����ϴ� Ÿ�Ժ�ȯ
		 ��Һ�ȯ�� �Ǵ� ��쿡�� �ݵ�� ��������� ĳ�����Ͽ��� �Ѵ�.
		 ��, ������ �ս��� �߻��� �� �ִ�.
			 *  */
			double varDou = 123.456;
			int varInt2 = 1;
		//  int downByte = (int) varDou;
			byte varB2 = (byte) varInt2;
			float varF = 123.456f;
			int varInt3 = (int) varF;
			System.out.println("varInt3 �� : " + varInt3);
	}
	
	

	
}		



