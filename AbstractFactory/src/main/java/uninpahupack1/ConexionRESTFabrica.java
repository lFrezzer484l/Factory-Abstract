package uninpahupack1;

import uninpahupack2.FabricaAbstracta;
import uninpahupack2.IConexionBD;
import uninpahupack2.IConexionREST;
import uninpahupack3.ConexionRESTCompras;
import uninpahupack3.ConexionRESTNoArea;
import uninpahupack3.ConexionRESTVentas;

public class ConexionRESTFabrica implements FabricaAbstracta {

	@Override
	public IConexionREST getREST(String area) {
		if (area == null) {
			return new ConexionRESTNoArea();
		}
		if (area.equalsIgnoreCase("COMPRAS")) {
			return new ConexionRESTCompras();
		} else if (area.equalsIgnoreCase("VENTAS")) {
			return new ConexionRESTVentas();
		}

		return new ConexionRESTNoArea();
	}

	@Override
	public IConexionBD getBD(String motor) {
		return null;
	}
}
