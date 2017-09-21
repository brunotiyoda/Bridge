package impl;

public class Quadrado implements FormaGeometricaImp {

	public static Quadrado instancia;
	public static Quadrado getInstancia() {
		if (instancia == null)
            instancia = new Quadrado();
        return instancia;
    }
	
	@Override
	public void desenhaFormaGeometrica(String forma) {
		System.out.println(forma + " Forma Quadrado");
	}

	@Override
	public void cor(String cor) {
		System.out.println(cor + " Quadrado Circulo \n");
	}

}
