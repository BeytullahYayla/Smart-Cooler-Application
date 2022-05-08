package CentralProcessingUnit.SicaklikAlgilayici.Concrete;
import java.util.Random;

import CentralProcessingUnit.SicaklikAlgilayici.Abstract.ISicaklikAlgilayici;
import Observer.Abstract.Subject;
import Observer.Concrete.Subscriber1;
import Observer.Concrete.Subscriber2;


public class SicaklikAlgilayici implements ISicaklikAlgilayici {
    Subject publisher;
	public SicaklikAlgilayici(Subject publisher) {
    	this.publisher=publisher;
    }
    
	@Override
    public double sicaklikAlgila() {
        Random random=new Random();
        
        double temprature=random.nextDouble(50.0);
        if (temprature>40) {
        	Subscriber1 subscriber1=new Subscriber1();
        	Subscriber2 subscriber2=new Subscriber2();
        	publisher.attach(subscriber1);
        	publisher.attach(subscriber2);
        
			publisher.notify("Sýcaklýk 40 dereceyi geçti.Sogutucuyu acmaniz tavsiye edilir");
			
			publisher.detach(subscriber1);
			publisher.detach(subscriber2);
		}
        return temprature;
    }

	
}
