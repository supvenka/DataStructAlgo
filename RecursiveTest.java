
public class RecursiveTest {

	public static void recurse(int n) {

			recurse(n-1);
//		System.out.println(n);
	}

	public static void main(String args[]) {
		
		recurse(10);

	}

}
