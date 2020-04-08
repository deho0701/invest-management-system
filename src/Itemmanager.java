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
			System.out.println("Investment item to be edited is"+name);
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
