package principal;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner n1 = new Scanner(System.in);
		System.out.println("Digite sua primeira nota: ");
		float nota1 = n1.nextFloat();
		System.out.println("Digite sua segunda nota: ");
		float nota2 = n1.nextFloat();
		System.out.println("Digite sua terceira nota: ");
		float nota3 = n1.nextFloat();
		float media = (nota1+nota2+nota3)/3;
		System.out.println("Sua média foi " + media);
		
	}

}
