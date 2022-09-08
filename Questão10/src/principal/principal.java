package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner perg = new Scanner(System.in);
		System.out.println("Digite o raio: ");
		float raio = perg.nextFloat();
		float area = (float) (3.1415 * (raio*raio));
		System.out.println("A área desejada é " + area);

	}

}