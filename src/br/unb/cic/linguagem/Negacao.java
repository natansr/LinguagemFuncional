package br.unb.cic.linguagem;

import Tipos.Booleano;
import Tipos.Valor;


public class Negacao extends Expressao {
	private Expressao exp1;

	
    public Negacao(Expressao exp1) {
        this.exp1 = exp1;
    }
    
public Valor avaliaExp(Ambiente env) throws ErroDeTipo, ErroVarNaoExiste{
		
		Booleano bool1;
		
		bool1 = (Booleano)exp1.avalia(env);

		
		return new Booleano(!bool1.getValor());
		
	}
	
	public Boolean checaTipo(Ambiente env) throws ErroVarNaoExiste{
		
		return recuperaTipo(env).equals(TipoExpressao.BOOLEANO);
		
	}
	
	public TipoExpressao recuperaTipo(Ambiente env) throws ErroVarNaoExiste{
		
		if(exp1.recuperaTipo(env).equals(TipoExpressao.BOOLEANO)){
			return TipoExpressao.BOOLEANO;
		}else return TipoExpressao.INVALIDO;
		
		
		
	}
}
