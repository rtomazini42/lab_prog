
public abstract class FuncionarioAutenticavel extends Funcionario{
	//int senha = 0000;
	public static void autenticar(int senha){
		if (senha == 00){
			System.out.println("Acesso Permitido");
			Funcionario.acessar(true);
		}
		else{
			System.out.println("Acesso Negado");
		}
		
		
	}
}
