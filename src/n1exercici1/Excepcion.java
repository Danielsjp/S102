package n1exercici1;

public class Excepcion {

	private static int a=1;
	private static String b="text";
	private static int c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			c= a / 0 ;
		}
		
		catch (Exception e) {
		      System.out.println("Algo ha ido mal, el error es: "+ e.getMessage());
		
		}
		
		finally {
			System.out.println("El programa continua.");
			
		}
	}

}
