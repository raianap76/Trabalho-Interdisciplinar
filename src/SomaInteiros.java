
import java.util.Scanner;

class SomaInteiros {

	public static void main(String[] args) {
		
		int a, b, c = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Insira os númerosd:ss ");
		a = s.nextInt();
		b = s.nextInt();
		c = a + b;
		System.out.println("A soma de a e b é: " + c);
	}

}