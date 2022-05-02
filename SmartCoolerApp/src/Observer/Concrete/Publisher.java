package Observer.Concrete;

import java.util.ArrayList;
import java.util.List;

import Observer.Abstract.Observer;
import Observer.Abstract.Subject;

public class Publisher implements Subject {
	List<Observer> subscribers=new ArrayList<>();

	@Override
	public void attach(Observer observer) {
		subscribers.add(observer);
		
	}

	@Override
	public void detach(Observer observer) {
		subscribers.remove(observer);
		
	}

	@Override
	public void notify(String message) {
		for(Observer observer:subscribers) {
			observer.Update(message);
		}
		
	}

}
