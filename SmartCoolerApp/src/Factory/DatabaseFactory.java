package Factory;

import CentralProcessingUnit.Database.Abstract.DatabaseRepository;
import CentralProcessingUnit.Database.Concrete.PostgreSQLDatabase;
import CentralProcessingUnit.Database.Concrete.VirtualDatabase;

public class DatabaseFactory implements IDatabaseFactory {

	@Override
	public DatabaseRepository getDatabaseByDriverType(String DbType) {
		// TODO Auto-generated method stub
		if(DbType.equalsIgnoreCase("Postgres")) {
			return new PostgreSQLDatabase();
		}
		else if(DbType.equalsIgnoreCase("Virtual")) {
			return new VirtualDatabase();
		}
		return null;
	}

}
