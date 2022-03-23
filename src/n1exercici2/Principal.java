package n1exercici2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Excepcion hola = null;
		
	try {
		hola.toString();
	}
	
	catch (Exception e) {
		  
	      System.out.println("Algo ha ido mal, el error es: "+ e.getMessage());
	      
	}
	
	finally {
		System.out.println("El programa continua. ");
		
	}
   
	}

}
