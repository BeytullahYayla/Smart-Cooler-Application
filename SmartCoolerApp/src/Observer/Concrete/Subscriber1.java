package Observer.Concrete;

import Observer.Abstract.Observer;

public class Subscriber1 implements Observer{

	@Override
	public void Update(String message) {
	  System.out.println("Message to subscriber1 is:"+message);
		
	}

}
