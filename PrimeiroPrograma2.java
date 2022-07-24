package br.com.dio;

import br.com.dio.model2.Gato;

public class PrimeiroPrograma2 {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Livros livros = new Livros ();		
		System.out.println(gato);		
		System.out.println(livros);
		
		/* int a = 2;
		 int b = 3;
System.out.println("hello world! " + (a+b) );*/

	}
	

}
class Livros {
	private String nome;
	private String npag;
}