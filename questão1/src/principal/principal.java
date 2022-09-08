package principal;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner n1 = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = n1.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = n1.nextInt();
		System.out.println("Digite o terceiro número: ");
		int num3 = n1.nextInt();		
		System.out.println("Digite o quarto número: ");
		int num4 = n1.nextInt();
		int soma = num1+num2+num3+num4;
		System.out.println(soma);
		 
		
		
	}

}
