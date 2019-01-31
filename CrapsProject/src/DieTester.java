
public class DieTester {

	public DieTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Die test = new Die();
		for (int i = 0; i <= 100; i++) {
			test.roll();
			System.out.println(test.getNumDots());

		}

	}
}
