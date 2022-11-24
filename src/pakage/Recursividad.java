package pakage;

public class Recursividad {

	public static void main(String[] args) {

		int n = 131;
		
		System.out.println("El resultado de la suma de los dígitos es: " + sumaDigitos(n));
		
	}
	
	private static int sumaDigitos(int n){
		if(n==0){
			return 0;
		} else {
			return sumaDigitos(n/10) + n%10;
		}
	}
}
