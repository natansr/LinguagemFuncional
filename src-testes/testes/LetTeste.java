package testes;
import Tipos.*;
import br.unb.cic.linguagem.*;
import junit.framework.TestCase;


public class LetTeste extends TestCase {

	
	public void testLet() throws ErroVarNaoExiste, ErroDeTipo {
		Ambiente env = new Ambiente();
		IConst int2 =  new IConst(2);
		IConst int3 = new IConst(3);
		Let let = new Let("y",int2,int3);
		Expressao recebeID = new RefId("y");

		
		
		
		try {
			/*Foram criadas duas variaveis auxiliares para receberem
			os valores do let e do RefId. Elas são necessarias para fazer o cast de Inteiros;*/
			
			IConst auxiliar = (IConst)let.avalia(env);
			IConst auxiliarID = (IConst)recebeID.avaliaExp(env);
			
			/*Teste executado com o valor do LET que foi atribuido como 3 na declaracao de variaveis,
			 * e teste executado com o RefId que recebeu o valor 2 atribuido a Y quando Let foi chamado*/
			assertEquals(new IConst(3).getValor(),auxiliar.getValor());
			assertEquals(new IConst(2).getValor(),auxiliarID.getValor());

		} catch (ErroDeTipo e) {
			e.printStackTrace();
			
		}
		
	
	}
}
