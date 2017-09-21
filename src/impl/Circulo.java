package impl;

public class Circulo implements FormaGeometricaImp {

	public static Circulo instancia;
	public static Circulo getInstancia() {
		if (instancia == null)
            instancia = new Circulo();
        return instancia;
    }
	
	@Override
	public void desenhaFormaGeometrica(String forma) {
		System.out.println(forma + " Forma Circulo");
	}

	@Override
	public void cor(String cor) {
		System.out.println(cor + " Cor Circulo \n");
	}

}
