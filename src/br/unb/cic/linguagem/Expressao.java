package br.unb.cic.linguagem;

import br.unb.cic.linguagem.Ambiente;
import Tipos.*;

public abstract class Expressao {
	
	/* Classe abstrata Expressao que serve de base para todas as expressoes do projeto.
	 Aqui sao declarados metodos abstratos que devem ser implementados nas classes filhas*/
	
	//Metodo abstrato que deve avaliar  uma Expressao
	public abstract Valor avaliaExp(Ambiente env) throws ErroDeTipo,  ErroVarNaoExiste ;
	
	//Metodo abstrato que checa o tipo das variaveis do ambiente
	public abstract Boolean checaTipo(Ambiente env) throws ErroVarNaoExiste;
	
	//Metodo para recuperar o tipo das variaveis do ambiente para posteriormente serem checadas
	public abstract TipoExpressao recuperaTipo(Ambiente env) throws ErroVarNaoExiste;
	
	//Metodo avalia para executar a checagem de tipos
	public Valor avalia(Ambiente env) throws ErroDeTipo, ErroVarNaoExiste{
		
		if(!checaTipo(env)){
			
			throw new ErroDeTipo();
			
			
		}
		else return avaliaExp(env); 
	};
	
	
	
	
}
