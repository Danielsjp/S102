package n1exercici4;

import n1exercici1.Excepcion;

class MyException extends Exception{
	
	public MyException(String str) {
		super(str);
	}
}

public class Principal {
	public static final String MENSAJE="Aixo ha fallat";
	public static void main(String[] args) {
		try {
			if(MENSAJE.contains("fallat")) {
				throw new MyException("Excepció: Ha fallat / ");
			}
		} catch(MyException me) {
			System.out.println(me.getMessage() +" Tipus d´Excepció: "+ me.getClass());
		}
		
	}

}
