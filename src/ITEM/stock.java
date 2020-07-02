package ITEM;
 import java.util.Scanner;

public class stock extends Investment_item {
	public void getUserInput(Scanner input) {
		
		System.out.println("Investment name:");
		String name=input.next(); 
		this.setName(name);
		System.out.println("Investment amount($):");
		int amount=input.nextInt(); 
		this.setAmount(amount);
		char answer='q';
		System.out.println("Do you want to invest more than a year?(Y/N)");
		answer =input.next().charAt(0);
		while(answer!='y' && answer!='Y' && answer!='N' && answer!='n') {
			if(answer=='Y'&&answer=='y') {
				System.out.println("Target investment period:");
				String period=input.next(); 
				this.setPeriod(period);  
				break;
			}
			else if(answer=='N'&&answer=='n') {
				this.setPeriod("less than a year");
				break; 	
			}
			else {
				
			}
		}
		System.out.println("Target return on investment(%):");
		int target=input.nextInt();
		this.setTarget(target);
	}
}
