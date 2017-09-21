package abs;

import impl.FormaGeometricaImp;

public class Amarelo extends CorAbs {
	
	
	
	public Amarelo(FormaGeometricaImp formaGeometricaImp) {
		super(formaGeometricaImp);
	}

	@Override
	public void desenhar() {
		desenhaFormaGeometrica("");
		cor("Amarelo");
	}

}
