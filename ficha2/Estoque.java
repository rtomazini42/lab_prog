package ficha_2;

public class Estoque {
	String nome;
	int qtdAtual;
	int qtdMinima;
	
	public Estoque(String nome,int qtdAtual,int qtdMinima) {
		this.nome = nome;
		this.qtdMinima = qtdMinima;
		if(qtdMinima > 0) {
			this.qtdMinima = qtdMinima;
		}
		
		else {
			System.out.println("impossivel ser negativo");
			}
		
		if(qtdAtual > 0) {
			this.qtdAtual = qtdAtual;
		}
		
		else {
			System.out.println("impossivel ser negativo");
			}
	}
	
	public Estoque() {
		
	}
	
	
	public void mudarNome(String nome) {
		this.nome = nome;
	}
	
	public void mudarQtdMinima(int qtd) {
		if(qtd > 0) {
			this.qtdMinima = qtd;
		}
		else {
			System.out.println("impossivel ser negativo");
		}
	}
	
	public void repor(int qtd) {
		this.qtdAtual = qtdAtual + qtd;
		System.out.println(qtdAtual);
	}
	public void darBaixa(int qtd) {
		this.qtdAtual = qtdAtual - qtd;
		if(qtdAtual < qtd) {
			System.out.println("impossivel dar baixa");
		}
		//System.out.println(qtdAtual);
		
	}
	

	public String getNome() {
		return nome;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public int getQtdMinima() {
		return qtdMinima;
	}



	public  void mostra() {
		System.out.println("________________________________");
		System.out.println("Nome: " + getNome());
		System.out.println("Quantidade atual: " + getQtdAtual());
		System.out.println("Quantidade minima: " + getQtdMinima());
		System.out.println("________________________________");
		
	}
	
	public boolean precisaRepor() {
		if (qtdMinima >= qtdAtual){
			return true;
		}
		else {
			return false;
		}
	}


		
	
}
