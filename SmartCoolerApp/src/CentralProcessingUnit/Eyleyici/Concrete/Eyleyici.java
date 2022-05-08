package CentralProcessingUnit.Eyleyici.Concrete;


public class Eyleyici implements CentralProcessingUnit.Eyleyici.Abstract.IEyleyici {
    @Override
    public void sogutucuAc() {
        System.out.println("Sogutucu Acildi");
    }

    @Override
    public void sogutucuKapat() {
        System.out.println("Sogutucu Kapatildi");
    }
}
