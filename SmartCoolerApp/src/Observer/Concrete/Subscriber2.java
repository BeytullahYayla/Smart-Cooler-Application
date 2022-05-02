package Observer.Concrete;

import Observer.Abstract.Observer;

public class Subscriber2 implements Observer {

	@Override
	public void Update(String message) {
		System.out.println("Message to Subscriber2 is:"+message);
		
	}

}
