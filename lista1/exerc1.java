package exerc;
import java.util.Scanner;

public class exerc1 {

	private static Scanner numero;

	public static void main(String[] args) {
		numero = new Scanner(System.in);
		
		int num;
		do{
			System.out.println("Insira a nota:");
			num = numero.nextInt();
		}while(teste(num) == false);
	}
	
public static boolean teste(int valor){
	if (valor > 10) {
		System.out.println("valor invalido");
		return false;
	}
	if (valor < 0) {
		System.out.println("valor invalido");
		return false;
	}
	else {
		System.out.println("Valor valido");
		return true;
	}
}

}
