package CentralProcessingUnit.AgArayuzu.Concrete;


import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

import CentralProcessingUnit.Database.Abstract.DatabaseRepository;
import CentralProcessingUnit.Database.Concrete.PostgreSQLDatabase;
import CentralProcessingUnit.Eyleyici.Concrete.Eyleyici;

import CentralProcessingUnit.SicaklikAlgilayici.Concrete.SicaklikAlgilayici;
import Factory.DatabaseFactory;
import Factory.IDatabaseFactory;

import Observer.Concrete.Publisher;
import Observer.Concrete.Subscriber1;

public class ConsoleUI {

    public static void main(String[] args) {
   
    	
        AgArayuzu agArayuzu=new AgArayuzu(new Eyleyici(),new SicaklikAlgilayici(new Publisher()));
        IDatabaseFactory databaseFactory=new DatabaseFactory();
        
        Scanner input=new Scanner(System.in);
        System.out.print("Username:");
       String userName=input.nextLine();
     
       System.out.print("Password:");
       Scanner input2=new Scanner(System.in);
       String password=input2.nextLine();
     
      
       Scanner input3=new Scanner(System.in);
       DatabaseRepository database=databaseFactory.getDatabaseByDriverType("Postgres");
      int devamMi;
       if(database.validateUser(userName, password)) {
    	   do {
    	   agArayuzu.getMenu();
    	   Scanner input4=new Scanner(System.in);
    	   int cevap=input4.nextInt();
    	   if (cevap==1) {
			agArayuzu.sicaklikGonder();
		}
    	   else if(cevap==2) {
    		   agArayuzu.sogutucuAc();
    	   }
    	   else if(cevap==3) {
    		   agArayuzu.sogutucuKapat();
    	   }
    	   else if(cevap==4){
    		   System.out.println("Cikis Yapildi");
    		   return;
    	   }
    	   System.out.println("Baska islem yapmak istiyor musunuz?(Evet:1     Hayir:0)");
    	   Scanner input5=new Scanner(System.in);
    	   devamMi=input5.nextInt();
    	   }while(devamMi!=0);
       }
       
       
     
   
    
       
    }
}
