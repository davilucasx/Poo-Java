package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da escada :");
		float tamanho = sc.nextFloat();
		System.out.println("Digite a altura que deseje pregar o quadro :");
		float altura = sc.nextFloat();
		float distanciateste = tamanho * tamanho - altura * altura;
		System.out.println("A distancia é : " + Math.sqrt(distanciateste));

	}

}
