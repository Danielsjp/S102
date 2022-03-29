package n1exercici3;

public class ArrayIndexOutOfBoundsExample {

	private static int[] exampleVariableOne = new int[10];

	public static void main(String[] args) {
		try {
			exampleVariableOne[11] = 9;
			System.out.println("Array index is valid");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ERROR:" + e.getMessage());
		}
	}
}