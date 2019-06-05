package pucrs.java.maven.somar;

/**
 * @author Marcelo Campos
 *
 */
public class Somar {
	
	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println(somar(a,b));
		
	}

	
	static int somar(int a, int b) {
		return a+b;
	}
}
