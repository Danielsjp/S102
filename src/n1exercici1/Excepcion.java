package n1exercici1;

public class Excepcion {

	static int a=1;
	static String b="text";
	static int c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			c= a + a;
		}
		
		catch (Exception e) {
		      System.out.println("Algo ha ido mal");
		
		}
		
		finally {
			System.out.println("Todo OK");
			
		}
	}

}
