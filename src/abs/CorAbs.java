package abs;

import impl.FormaGeometricaImp;

public abstract class CorAbs {
	protected FormaGeometricaImp formaGeometricaImp;
	
	

	public CorAbs(FormaGeometricaImp formaGeometricaImp) {
		this.formaGeometricaImp = formaGeometricaImp;
	}

	public void desenhaFormaGeometrica(String forma) {
		this.formaGeometricaImp.desenhaFormaGeometrica(forma);
	}

	public void cor(String cor) {
		this.formaGeometricaImp.cor(cor);
	}

	public abstract void desenhar();

}
