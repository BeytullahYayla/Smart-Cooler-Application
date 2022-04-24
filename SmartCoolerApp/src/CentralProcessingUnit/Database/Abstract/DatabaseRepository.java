package CentralProcessingUnit.Database.Abstract;

import Entity.Concrete.User;

public interface DatabaseRepository {
	public boolean validateUser(String username,String password);

}
