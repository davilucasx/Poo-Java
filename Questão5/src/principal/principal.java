package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu sal�rio: ");
		float salario = sc.nextFloat();
		System.out.println("Digite o percentual do aumento: ");
		int percentual = sc.nextInt();
		float aumento = salario * percentual/100;
		float novoSal = salario + aumento;
		System.out.println("O aumento foi de " + aumento + "\nO seu novo sal�rio � " + novoSal);
	}

}
