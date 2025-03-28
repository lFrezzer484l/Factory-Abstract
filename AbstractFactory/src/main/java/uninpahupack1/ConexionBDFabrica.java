package uninpahupack1;

import uninpahupack2.FabricaAbstracta;
import uninpahupack2.IConexionBD;
import uninpahupack2.IConexionREST;
import uninpahupack3.ConexionMySQL;
import uninpahupack3.ConexionOracle;
import uninpahupack3.ConexionPostgreSQL;
import uninpahupack3.ConexionSQLServer;
import uninpahupack3.ConexionVacia;

public class ConexionBDFabrica implements FabricaAbstracta{

	@Override
	public IConexionBD getBD(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer();
		}

		return new ConexionVacia();
	}

	@Override
	public IConexionREST getREST(String area) {
		return null;
	}
}
