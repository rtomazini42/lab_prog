package exerc;
import java.util.Scanner;

public class exerc4 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int x = 0;
		System.out.println("Insira o numero:");
		int numero = entrada.nextInt(); //nao vejo necessidade de botar um teto e um ch�o de valores para entrada se ele j� satisfaz os valores inteiros da questao (1 at� 10)
		
		while(x < 10) {
			int res;
			x++;
			res = numero * x;
			System.out.println(numero + "x" + x + " = " + res);
		}
	}
	

	
}


