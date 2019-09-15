package exerc;
import java.util.Scanner;

public class exerc6 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		int altura_max = 0,altura_min = 300;
		int x = 0;
		do {
		x++;
		System.out.println("Insira a altura da pessoa " + x + " em cm:");
		int altura = entrada.nextInt();
		if(altura_max < altura) {
			altura_max = altura;
		}
		if(altura_min > altura) {
			altura_min = altura;
		}
		//System.out.println(altura_max + "   "+ altura_min);	
		}while(x<15);
		System.out.println("A pessoa mais alta tem: "+ altura_max + " cm ");	
		System.out.println("A pessoa mais baixa tem: "+ altura_min + " cm ");
	}
	

	
}


