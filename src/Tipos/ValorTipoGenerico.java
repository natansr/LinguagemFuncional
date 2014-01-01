package Tipos;

import Tipos.Valor;
import br.unb.cic.linguagem.*;

/*Classe abstrata Valor tipo generico. Implicito pelo nome, essa classe tem o objetivo de criar valores
 * de tipos genericos para serem usados em Expressoes. Essa classe contem metodos que auxiliam na
 * manipulacao desses valores na declaracao e implementacao de variadas expressoes*/
public abstract class ValorTipoGenerico<T> extends Valor {

	protected T valor;
	
	public ValorTipoGenerico(T valor){
		
		this.valor = valor;
		
	}
	
	
	public T getValor(){
		
		return this.valor;
		
	}
	
	public Boolean checaTipo(Ambiente env){
		
		return true;
		
	}
}
