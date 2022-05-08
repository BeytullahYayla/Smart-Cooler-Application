package Factory;

import CentralProcessingUnit.Database.Abstract.DatabaseRepository;

public interface IDatabaseFactory {
	DatabaseRepository getDatabaseByDriverType(String DbType);
}
