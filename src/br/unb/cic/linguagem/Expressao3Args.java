package br.unb.cic.linguagem;

/*Classe abstrata Expressao com TRES argumentos do tipo Expressao. Essa classe eh uma classe filha de Expressao,
 *  ela herda os metodos que devem ser implementados(metodos de avaliacao e checagem de tipos).
 *  Funcao criada no intuito de ser usada em expressoes que usam tres argumentos(if-then-else)*/

public abstract class Expressao3Args extends Expressao {
	protected Expressao exp1;
	protected Expressao exp2;
	protected Expressao exp3;
	
	public Expressao3Args(Expressao e1, Expressao e2,Expressao e3) {
		this.exp1 = e1;
		this.exp2 = e2;
		this.exp3 = e3;
	}
}


	
	

