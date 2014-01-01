package br.unb.cic.linguagem;

import Tipos.*;


public class Or extends ExpressaoBinaria {
	public Or(Expressao exp1,Expressao exp2){
		super(exp1,exp2);
		
	}

	@Override
	public Valor avaliaExp(Ambiente env) throws ErroDeTipo, ErroVarNaoExiste {
		Booleano bool1;
		Booleano bool2;
		
		bool1 = (Booleano)exp1.avalia(env);
		bool2 = (Booleano)exp2.avalia(env);
		
		return new Booleano(bool1.getValor() || bool2.getValor());
		
	}

	@Override
	public Boolean checaTipo(Ambiente env) throws ErroVarNaoExiste {
		return recuperaTipo(env).equals(TipoExpressao.BOOLEANO);
	}

	@Override
	public TipoExpressao recuperaTipo(Ambiente env) throws ErroVarNaoExiste {
		if(exp1.recuperaTipo(env).equals(TipoExpressao.BOOLEANO) && exp2.recuperaTipo(env).equals(TipoExpressao.BOOLEANO)){
			return TipoExpressao.BOOLEANO;
		}else return TipoExpressao.INVALIDO;
	}
}
