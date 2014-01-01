package br.unb.cic.linguagem;

import Tipos.*;

/*Classe Let para fazer referencia de um indentificador a uma determinada expressao*/
public class Let extends Expressao{
	
	private String id;
	private Expressao exp1, exp2;
	
	public Let(String id, Expressao exp1, Expressao exp2){
		this.id = id;
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	
	/*Metodo para avaliacao da expressao*/
	@Override
	public Valor avaliaExp(Ambiente env) throws ErroDeTipo, ErroVarNaoExiste{
		
		/*Aqui eh feita a referencia do Id passado como parametro para a expressao, e a expressao passada.*/
		env.adicionarPar(this.id, this.exp1);
		return exp2.avalia(env);
		
	}
	
	/*Metodo para checagem de tipos da expressao*/
	@Override
	public Boolean checaTipo(Ambiente env) throws ErroVarNaoExiste{
		
		/*Nesse caso a expressao let pode conter tipos do tipo inteiro ou tipos do tipo booleano*/
		return recuperaTipo(env).equals(TipoExpressao.INTEIRO) || recuperaTipo(env).equals(TipoExpressao.BOOLEANO);
		
	}
	
	/*Metodo para recuperar o tipo da expressao*/
	@Override
	public TipoExpressao recuperaTipo(Ambiente env) throws ErroVarNaoExiste{
		
		if(exp1.recuperaTipo(env).equals(TipoExpressao.INTEIRO) && exp2.recuperaTipo(env).equals(TipoExpressao.INTEIRO)){
			return TipoExpressao.INTEIRO;
			
		}else if(exp1.recuperaTipo(env).equals(TipoExpressao.BOOLEANO) && exp2.recuperaTipo(env).equals(TipoExpressao.BOOLEANO))
			return TipoExpressao.BOOLEANO;
		else {
			return TipoExpressao.INVALIDO;
		}
	}

	
}
