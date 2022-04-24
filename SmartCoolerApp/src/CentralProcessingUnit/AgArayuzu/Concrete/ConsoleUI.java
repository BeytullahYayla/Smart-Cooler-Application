package CentralProcessingUnit.AgArayuzu.Concrete;


import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

import CentralProcessingUnit.Database.Concrete.Database;
import CentralProcessingUnit.Eyleyici.Concrete.Eyleyici;
import CentralProcessingUnit.SicaklikAlgilayici.Concrete.SicaklikAlgilayici;

public class ConsoleUI {

    public static void main(String[] args) {
        AgArayuzu agArayuzu=new AgArayuzu(new Eyleyici(),new SicaklikAlgilayici());
        Scanner input=new Scanner(System.in);
        System.out.print("Username:");
       String userName=input.nextLine();
     
       System.out.print("Password:");
       Scanner input2=new Scanner(System.in);
       String password=input2.nextLine();
       
       Database database=new Database();
       if(database.validateUser(userName, password)) {
    	   agArayuzu.getMenu();
       }
    
       
    }
}
