package CentralProcessingUnit.AgArayuzu.Concrete;

import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;
import CentralProcessingUnit.Eyleyici.Abstract.IEyleyici;
import CentralProcessingUnit.SicaklikAlgilayici.Abstract.ISicaklikAlgilayici;
import Observer.Concrete.Subscriber1;

public class AgArayuzu implements CentralProcessingUnit.AgArayuzu.Abstract.IAgArayuzu {

    private IEyleyici eyleyici;
    private ISicaklikAlgilayici sicaklikAlgilayici;
    public AgArayuzu(IEyleyici eyleyici,ISicaklikAlgilayici sicaklikAlgilayici){
        this.eyleyici=eyleyici;
        this.sicaklikAlgilayici=sicaklikAlgilayici;
    }
    @Override
    public void getMenu() {
    	System.out.println("1)Sicaklik Goruntule\n2)Sogutucu Calistir\n3)Sogutucu Kapat\n4)Cikis");
    	


    }

    @Override
    public void sogutucuAc() {
        this.eyleyici.sogutucuAc();

    }

    @Override
    public void sogutucuKapat() {
        this.eyleyici.sogutucuKapat();
    }

    @Override
    public void sicaklikGonder() {
        double sicaklik=this.sicaklikAlgilayici.sicaklikAlgila();
        
        
        System.out.println("Guncel Sicaklik:"+sicaklik);
    }
}
