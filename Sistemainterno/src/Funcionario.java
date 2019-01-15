
public abstract class Funcionario {
	protected static void acessar(boolean acesso){
		if(acesso == true){
			System.out.println("Acesado");
			}
		else {
			System.out.println("vaza");
		}
		}
	}