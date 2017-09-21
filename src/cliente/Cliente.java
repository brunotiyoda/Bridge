/* Formas Geométricas: Quadrado, Triangulo e Circulo.
 * */

package cliente;

import abs.Amarelo;
import abs.CorAbs;
import abs.Verde;
import abs.Vermelho;
import impl.Circulo;
import impl.Quadrado;
import impl.Triangulo;

public class Cliente {
	public static void main(String[] args) {
		CorAbs corAbs = new Amarelo(new Circulo());
		
		corAbs.desenhar();
		
		corAbs = new Vermelho(new Circulo());
		corAbs.desenhar();
		
		corAbs = new Verde(new Circulo());
		corAbs.desenhar();
		
		corAbs = new Amarelo(new Quadrado());
		corAbs.desenhar();
		
		corAbs = new Vermelho(new Quadrado());
		corAbs.desenhar();
		
		corAbs = new Verde(new Quadrado());
		corAbs.desenhar();
		
		corAbs = new Amarelo(new Triangulo());
		corAbs.desenhar();
		
		corAbs = new Vermelho(new Triangulo());
		corAbs.desenhar();
		
		corAbs = new Verde(new Triangulo());
		corAbs.desenhar();		
		
	}
}
