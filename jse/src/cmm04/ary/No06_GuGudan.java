package cmm04.ary;

public class No06_GuGudan {
	public static void main(String[] args) {

		for (int j = 2; j < 10; j++) {
			if (j <= 5) {
				System.out.println("\n");
			} else if (j > 6 || j < 10) {
				System.out.println("\n");
			}
			for (int i = 1; i < 10; i++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}

		}
	}
}
