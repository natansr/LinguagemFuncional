package br.unb.cic.linguagem;

import Tipos.*;

/*Classe and. Esta classe eh uma classe filha de expressao binaria. Serve para implementar a
 * expressao logica and na nossa linguagem*/
public class And extends ExpressaoBinaria{
	
	
	public And(Expressao exp1,Expressao exp2){
		
		super(exp1,exp2);
		
	}
	
	/*Metodo para avaliacao*/
	@Override
	public Valor avaliaExp(Ambiente env) throws ErroDeTipo, ErroVarNaoExiste{
		
		Booleano bool1;
		Booleano bool2;
		
		bool1 = (Booleano)exp1.avalia(env);
		bool2 = (Booleano)exp2.avalia(env);
		
		return new Booleano(bool1.getValor() && bool2.getValor());
		
	}
	
	/*Metodo para checagem de tipos*/
	@Override
	public Boolean checaTipo(Ambiente env) throws ErroVarNaoExiste{
		
		return recuperaTipo(env).equals(TipoExpressao.BOOLEANO);
		
	}
	
	/*Metodo para recuperar tipo da expressao. Serve para auxiliar na checagem de tipos*/
	@Override
	public TipoExpressao recuperaTipo(Ambiente env) throws ErroVarNaoExiste{
		
		if(exp1.recuperaTipo(env).equals(TipoExpressao.BOOLEANO) && exp2.recuperaTipo(env).equals(TipoExpressao.BOOLEANO)){
			return TipoExpressao.BOOLEANO;
		}else return TipoExpressao.INVALIDO;
		
		
		
	}
}
