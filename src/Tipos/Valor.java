package Tipos;

import br.unb.cic.linguagem.*;

/*Classe abstrata Valor. Esta classe eh uma classe filha de Expressao. Essa classe servirá como classe
pai para outras classes. Foi criada com o objetivo de criar Expressoes do tipo Valor e possibilitar a
checagem de tipos*/
public abstract class Valor extends Expressao {

	
	public Valor avaliaExp(Ambiente env) throws ErroDeTipo{
		
		return this;
	}
	
	
	
}
