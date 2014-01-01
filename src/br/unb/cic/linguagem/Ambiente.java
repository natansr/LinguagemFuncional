package br.unb.cic.linguagem;

import java.util.HashMap;

/*Classe Ambiente. Esta classe tem como o objetivo criar um ambiente para execucao e manipulacao 
 * das expressoes.*/
public class Ambiente {
	
	/*Declaracao de um hash. Serve para retornar uma expressao de acordo com seu Id. Será muito util
	 * na implementacao do LET e REFID*/
	private HashMap<String, Expressao> env = new HashMap<String, Expressao>();
    
	
	
	public Ambiente() {
		env = new HashMap<String, Expressao>();
	}
	
	/*Metodo para fazer a ligacao de uma String id com uma determinada expressao*/
	public void adicionarPar(String id, Expressao exp)  {
		env.put(id, exp);
	}
	
	/*Metodo para recuperar uma determinada expressao de acordo com o Id passado como parametro.*/
	public Expressao obterExpressao(String id) throws ErroVarNaoExiste{

		 Expressao valor = (Expressao) env.get(id);
	        if (valor == null) {
	            throw new ErroVarNaoExiste();
	        }
	        return valor;
	}
	
	
    
    
}
    

