package CentralProcessingUnit.Database.Abstract;

import Entity.Concrete.User;

public interface DatabaseRepository {
	public void validateUser(String username,String password);

}
