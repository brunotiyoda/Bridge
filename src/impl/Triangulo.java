package impl;

public class Triangulo implements FormaGeometricaImp {

	public static Triangulo instancia;
	public static Triangulo getInstancia() {
		if (instancia == null)
            instancia = new Triangulo();
        return instancia;
    }
	
	@Override
	public void desenhaFormaGeometrica(String forma) {
		System.out.println(forma + " Forma Triangulo");
	}

	@Override
	public void cor(String cor) {
		System.out.println(cor + " Cor Triangulo \n");
	}

}
