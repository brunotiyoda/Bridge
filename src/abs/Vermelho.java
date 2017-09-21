package abs;

import impl.FormaGeometricaImp;

public class Vermelho extends CorAbs{

	public Vermelho(FormaGeometricaImp formaGeometricaImp) {
		super(formaGeometricaImp);
	}

	@Override
	public void desenhar() {
		desenhaFormaGeometrica("");
		cor("Vermelho");		
	}

}
