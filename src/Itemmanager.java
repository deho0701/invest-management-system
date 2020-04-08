import java.util.Scanner;

public class Itemmanager {
	Investment_item investment_item;
	Scanner input;
	
	Itemmanager(Scanner input){
		this.input=input;
	}
	
	public void Add_Investment_item() {
		investment_item =new Investment_item();
		System.out.println("Item name:");
		investment_item.name=input.next(); 
		System.out.println("Investment amount($):");
		investment_item.amount=input.nextInt(); 
		System.out.println("Target investment period:");
		investment_item.period=input.next(); 
		System.out.println("Target return on investment(%):");
		int return_on_investment=input.nextInt(); 
	}
	public void Delete_investment_item() {
		System.out.println("Item name");
		String name=input.next(); 
		if (investment_item.name==null) {
			System.out.println("Investment item has not been registered");
			return;
		}
		if(investment_item.name==name) {
			name=null;
			System.out.println("Investment item is deleted");
		}
	}
	public void Revise_investment_item() {
		System.out.println("Item name");
		String name=input.next(); 
		if(investment_item.name==name) {
			int num=0;
			while(num!=5) {		
				System.out.println("-Invest info edit menu");
				System.out.println("Select one");
				System.out.println("1.edit name");
				System.out.println("2.edit amount");
				System.out.println("3.edit period");
				System.out.println("4.edit target");			
				System.out.println("5.Exit");
				num =input.nextInt();
				if (num==1) {
					investment_item =new Investment_item();
					System.out.println("Item name:");
				}
				else if (num==2) {
					System.out.println("Investment amount($):");
					investment_item.amount=input.nextInt(); 
				}
				else if (num==3) {
					System.out.println("Target investment period:");
					investment_item.period=input.next();
				}
				else if (num==4) {
					investment_item.period=input.next(); 
					System.out.println("Target return on investment(%):");
				}
				else  {
					continue;
				}
			}
		}	
	}
	public void View_investment_item() {
		System.out.println("Item name");
		String name=input.next(); 
		if(investment_item.name==name) {
			investment_item.printinfo() ;
		}
	}
	public void Compare_with_other_Investment_item() {
		
	} 
	
}
