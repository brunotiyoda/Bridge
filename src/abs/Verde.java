package abs;

import impl.FormaGeometricaImp;

public class Verde extends CorAbs {

	public Verde(FormaGeometricaImp formaGeometricaImp) {
		super(formaGeometricaImp);
	}

	@Override
	public void desenhar() {
		desenhaFormaGeometrica("");
		cor("Verde");		
	}

}
