package CentralProcessingUnit.Database.Concrete;

import CentralProcessingUnit.Database.Abstract.DatabaseRepository;

public class VirtualDatabase implements DatabaseRepository{

	@Override
	public boolean validateUser(String username, String password) {
		
		return true;
	}

}
