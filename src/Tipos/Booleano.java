package Tipos;


import br.unb.cic.linguagem.*;

/*Classe do tipo Booleano. Esta classe foi criada para suportar valores do tipo boolean nas expressoes.*/
public class Booleano extends ValorTipoGenerico<Boolean> {
	

		public Booleano(Boolean valor) {
			super(valor);
		}
		
		public TipoExpressao recuperaTipo(Ambiente env){
			
			  return TipoExpressao.BOOLEANO;
		}

		
	}


