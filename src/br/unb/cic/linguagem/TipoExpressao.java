package br.unb.cic.linguagem;


/*Classe do tipo enum. Esta classe foi necessariamente declarada para ser usada em expressoes como
 * if-then-else que usa tipos distintos na declaracao da expressao.(Classe tambem eh usada em expressoes
 * binarias).*/
public enum TipoExpressao {
	
	INTEIRO(0),BOOLEANO(1),INVALIDO(666);
	
	protected int tipo;
	
	TipoExpressao(int tipo){
		
		this.tipo = tipo;
	}
	
	public int getTipo(){
		
		return tipo;
	}
	
	public void setTipo(int tipo){
		
		this.tipo = tipo;
	}

}
