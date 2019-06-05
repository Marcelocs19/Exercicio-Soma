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
				
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println(somar(a,b));
		
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	static int somar(int a, int b) {
		return a+b;
	}
}
