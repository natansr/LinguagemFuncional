package br.unb.cic.linguagem;

import Tipos.*;

/*Classe REFId. Esta classe serve basicamente para recuperar uma expressao associada a um determinado identificador.*/
public class RefId extends Expressao {
	
	private String id;
	Expressao aux;
	
	
	public RefId(String id) {
		this.id = id;
	}
	
	/*Metodo para avaliacao da expressao*/
	@Override
	public Valor avaliaExp(Ambiente env) throws ErroDeTipo, ErroVarNaoExiste{
		Expressao exp = env.obterExpressao(id);
		aux = exp;
		aux.avalia(env);
		return exp.avalia(env);
	}
	
	/*Metodo para checagem de tipos*/
	@Override
	public Boolean checaTipo(Ambiente env) throws ErroVarNaoExiste{
		/*Usa a mesma checagem de LET. Expressoes associadas a um indentificador pode ser inteira ou booleana*/
		return recuperaTipo(env).equals(TipoExpressao.INTEIRO) || recuperaTipo(env).equals(TipoExpressao.BOOLEANO);
	}
	
	/*Metodo para recuperar o tipo da expressao*/
	@Override
	public TipoExpressao recuperaTipo(Ambiente env) throws ErroVarNaoExiste{
		if(aux.recuperaTipo(env).equals(TipoExpressao.INTEIRO)){
			return TipoExpressao.INTEIRO;
			
		}else if(aux.recuperaTipo(env).equals(TipoExpressao.BOOLEANO))
			return TipoExpressao.BOOLEANO;
		else {
			return TipoExpressao.INVALIDO;
		}
	
		
	}

}
