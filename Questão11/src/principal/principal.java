package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner positivo = new Scanner(System.in);
		System.out.println("Digite o número desejado");
		float num1 = positivo.nextFloat();
		if (num1 > 0) {
			float numquad = num1*num1;
			float numcubo = num1*num1*num1;
			System.out.println("O número " + num1 + " ao quadrado é " + numquad + "\n" + "O número " + num1 + " ao cubo é " + numcubo +
			"\n" + "A raiz quadrada de "+ num1 + " é " + Math.sqrt(num1) + "\n" + "A raiz cubica de " + num1 + " é " + Math.cbrt(num1));
		}
}}
