package br.unb.cic.linguagem;

import Tipos.*;

/*Classe Fatorial. Esta classe serve para implementar uma funcao fatorial recursiva. Serve tambem para provar o suporte
 * a funcoes recursivas do projeto usando expressoes IfThenElse. Achamos conveniente criar uma classe de expressao Fatorial, pois
 * tentamos criar um metodo recursivo e utilizar na recursao. Só que com a criacao desse metodo nao acontecia a avaliacao
 * do IfThenElse, ocorria apenas a avaliacao infinita do método fatorial.*/
public class Fatorial extends Expressao {
	protected IConst num;
	protected Ambiente env = new Ambiente();
	
	public Fatorial(IConst num){
		
		this.num = num;
	}
	

	/*Metodo para avaliacao da expressao*/
	@Override
	public Valor avaliaExp(Ambiente env) throws ErroDeTipo, ErroVarNaoExiste {
		Booleano If = new Booleano(num.getValor().equals(0));
		IConst Then = new IConst(1);
		/*Aqui que a recursao acontece. Neste caso a funcao nao poderia ser chamada como metodo, ela deve ser chamada como a criacao
		 * de uma nova expressao fatorial. Se a funcao fosse chamada sem ser criada uma nova expressao, a funcao fatorial seria chamada
		 * infinitamente ser antes passar pela avaliacao da expressao IfThenElse. 
		 * Com a criacao dessa nova expressao (new Fatorial), a funcao nao vai chamar automaticamente o metodo avaliar.
		 * Soh sera chamada depois que passar pela avaliacao da expressao IfThenElse.*/
		Multiplicacao Else = new Multiplicacao(num, new Fatorial(new IConst(num.getValor() - 1)));		
		
		
		Expressao ifThenElse = new IfThenElse(If, Then, Else);
		
		IConst aux = (IConst) ifThenElse.avalia(env);
		
		return aux;
	}

	/*Metodo para checar tipos da expressao*/
	@Override
	public Boolean checaTipo(Ambiente env) throws ErroVarNaoExiste {
		
		//O tipo deve ser inteiro, pois eh uma funcao fatorial.
		return recuperaTipo(env).equals(TipoExpressao.INTEIRO);
	}

	/*Metodos para recuperar o tipo da expressao*/
	@Override
	public TipoExpressao recuperaTipo(Ambiente env) throws ErroVarNaoExiste {
		if(num.recuperaTipo(env).equals(TipoExpressao.INTEIRO)){
			return TipoExpressao.INTEIRO;
		}else return TipoExpressao.INVALIDO;
		
	}
	
}
