package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		float rend, total;
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o valor do depósito: ");
		float deposito = sc.nextFloat();
		System.out.println("Digite o valor da taxa de juros: ");
		int juros = sc.nextInt();
		rend = deposito * juros/100;
		total = deposito + rend;
		System.out.println("O rendimento foi " + rend + "\nO valor total com rendimento é " + total);
		
		

	}

}
