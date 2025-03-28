package uninpahupack3;

import uninpahupack2.IConexionREST;

public class ConexionRESTCompras implements IConexionREST{

	@Override
	public void leerURL(String url) {		
		System.out.println("conectado a " + url);
	}

}
