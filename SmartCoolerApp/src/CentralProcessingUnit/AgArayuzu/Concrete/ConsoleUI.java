package CentralProcessingUnit.AgArayuzu.Concrete;

import CentralProcessingUnit.Database.Concrete.Database;
import CentralProcessingUnit.Eyleyici.Concrete.Eyleyici;
import CentralProcessingUnit.SicaklikAlgilayici.Concrete.SicaklikAlgilayici;

public class ConsoleUI {

    public static void main(String[] args) {
        AgArayuzu agArayuzu=new AgArayuzu(new Eyleyici(),new SicaklikAlgilayici());
        Database database=new Database();
        

    }
}
