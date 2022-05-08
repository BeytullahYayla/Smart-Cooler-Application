package CentralProcessingUnit.AgArayuzu.Concrete;

import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;
import CentralProcessingUnit.Eyleyici.Abstract.Eyleyici;
import CentralProcessingUnit.SicaklikAlgilayici.Abstract.SicaklikAlgilayici;
import Observer.Concrete.Subscriber1;

public class AgArayuzu implements CentralProcessingUnit.AgArayuzu.Abstract.AgArayuzu {

    private Eyleyici eyleyici;
    private SicaklikAlgilayici sicaklikAlgilayici;
    public AgArayuzu(Eyleyici eyleyici,SicaklikAlgilayici sicaklikAlgilayici){
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
