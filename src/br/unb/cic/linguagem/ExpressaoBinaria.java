package br.unb.cic.linguagem;

/*Classe abstrata Expressao Binaria do tipo Expressao. Essa classe eh uma classe filha de Expressao,
 *  ela herda os metodos que devem ser implementados(metodos de avaliacao e checagem de tipos).
 *  Funcao criada no intuito de ser usada em expressoes que usam dois argumentos(soma,multiplicacao,etc)*/


public abstract class ExpressaoBinaria extends Expressao {
	//Declaracao de dois parametros que serao usados na montagem da expressao
	protected Expressao exp1;
	protected Expressao exp2; 
	
	public ExpressaoBinaria(Expressao e1, Expressao e2) {
		this.exp1 = e1;
		this.exp2 = e2;
	}
}
