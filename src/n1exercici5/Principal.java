package n1exercici5;

class MyException extends Exception{
	
	public MyException(String str) {
		super(str);
	}
}


public class Principal {
	public static final int MAX=10;
	public static void main(String[] args) {
		int i = 0;
		do {
			// System.out.println(i);
			
			try {
				if(i<MAX)
				{
					throw new MyException("El numero: "+i+" Es menor que "+MAX);
				}
				else
				{
					System.out.println("LA EXCEPCIO JA NO ES CUMPLEIX");
				}
			} 
			catch(MyException me) {
				System.out.println(me.getMessage());
			}
			
			i++;
		} while (i <= 10);
		
	}

}
