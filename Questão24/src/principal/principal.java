package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===============================");
		System.out.println("Conversor de horas para minutos");
		System.out.println("===============================");
		System.out.println("Digite as horas como numero real: ");
		float hora = sc.nextFloat();
		int h = (int)hora;
		float minutos = hora - h;
		float conv = (h*60) + (minutos*60);
		System.out.println(hora + "H é equivalente a " + conv + " minutos");

	}

}
