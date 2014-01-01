package Tipos;


import br.unb.cic.linguagem.*;

/*Classe do tipo IConst. Esta classe foi criada para suportar valores inteiros nas expressoes.*/
public class IConst extends ValorTipoGenerico<Integer> {

	
	public IConst(Integer valor) {
		super(valor);
	}
	
	public TipoExpressao recuperaTipo(Ambiente env){
		
		  return TipoExpressao.INTEIRO;
	}

	

	
}
