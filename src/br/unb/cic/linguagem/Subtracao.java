package br.unb.cic.linguagem;

import Tipos.*;

/*Classe subtracao. Esta classe eh uma classe filha de expressao binaria. Serve para implementar a
 * expressao subtracao na nossa linguagem*/
public class Subtracao extends ExpressaoBinaria{
	
	
	
	public Subtracao(Expressao exp1, Expressao exp2) {
		super(exp1,exp2);
	}
	
	/*Metodo para avaliacao da expressao*/
	@Override
	public Valor avaliaExp(Ambiente env) throws ErroDeTipo, ErroVarNaoExiste {
		
		IConst int1;
		IConst int2;
		
		int1 = (IConst)exp1.avalia(env);
		int2 = (IConst)exp2.avalia(env);
		
		return new IConst(int1.getValor() - int2.getValor());
		
	}

	/*Metodo para checagem de tipos*/
	@Override
	public Boolean checaTipo(Ambiente env) throws ErroVarNaoExiste {
		return recuperaTipo(env).equals(TipoExpressao.INTEIRO);
	}

	/*Metodo para recuperar o tipo da expressao*/
	@Override
	public TipoExpressao recuperaTipo(Ambiente env) throws ErroVarNaoExiste {
		if(exp1.recuperaTipo(env).equals(TipoExpressao.INTEIRO) && exp2.recuperaTipo(env).equals(TipoExpressao.INTEIRO)){
			return TipoExpressao.INTEIRO;
		}else return TipoExpressao.INVALIDO;
		
	}
	
}
