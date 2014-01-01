package br.unb.cic.linguagem;

import Tipos.*;


/*Classe IfThenElse. Esta classe implementa a expressao IfThenElse na nossa linguagem. Esta expressao eh distinta das outras
 * expressoes, pois ela utiliza 3 argumentos na sua declaracao e composicao. Como forma de manter o codigo organizado foi criada
 * outra classe (Expressao3Args) para servir de classe pai para esta classe IfThenElse.*/
public class IfThenElse extends Expressao3Args{
	
	
	public IfThenElse(Expressao exp1, Expressao exp2, Expressao exp3){		
		super(exp1,exp2,exp3);
	}
	
	/*Metodo para avaliacao da expressao*/
	@Override
	public Valor avaliaExp(Ambiente env) throws ErroDeTipo, ErroVarNaoExiste{
		
		Booleano condition;
		condition = (Booleano)exp1.avalia(env);
		
		if(condition.getValor()){
			return exp2.avalia(env);
		}else return exp3.avalia(env);
	}
	
	/*Metodo para recuperar o tipo da expressao*/
	@Override
	public TipoExpressao recuperaTipo(Ambiente env) throws ErroVarNaoExiste{
		
		/*Nessa checagem e recuperacao de tipos eh verificado se o a primeira condicao da expressao eh do tipo Boolean e
		 * se as outras duas expressoes são do mesmo tipo. Esse eh o escopo de expressoes IfThenElse. Se ocorrer
		 * alguma inconsistencia de tipos como, expressoes Then E Else forem de tipos distintos, um erro eh retornado.*/

		
		if((exp1.recuperaTipo(env).equals(TipoExpressao.BOOLEANO) && exp2.recuperaTipo(env).equals(exp3.recuperaTipo(env)))){
			
			return exp2.recuperaTipo(env);
			
		}else return TipoExpressao.INVALIDO;
		
	}
		
	/*Metodo para checar o tipo da expressao*/
	@Override
	public Boolean checaTipo(Ambiente env) throws ErroVarNaoExiste{
		
		return	!recuperaTipo(env).equals(TipoExpressao.INVALIDO);
	}
		

}
