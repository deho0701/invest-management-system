
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

public class Itemmanager {
	ArrayList<Investment_item> investment_items=new ArrayList<Investment_item>() ;
	Scanner input;
	
	Itemmanager(Scanner input){
		this.input=input;
	}
	
	public void Add_Investment_item() {
		int kind=0;
		while(kind<0&&kind>4) {
			System.out.println("select Investment_item kind ");
			System.out.println("1. for stock  ");
			System.out.println("2. for money ");
			System.out.println("3. for bond ");
			System.out.println("4. for materials");
			kind=input.nextInt();
			if (kind==1) {
				Investment_item investment_item  =new stock();
				investment_item.getUserInput(input);
				investment_items.add(investment_item);
				break;
			}
			else if (kind==2) {
				Investment_item investment_item  =new Investment_item();
				investment_items.add(investment_item);
				investment_item.getUserInput(input);
				break;
			}
			else if (kind==3) {
				Investment_item investment_item  =new Investment_item();
				investment_items.add(investment_item);
				investment_item.getUserInput(input);
				break;
			}
			else if (kind==4) {
				Investment_item investment_item  =new Investment_item();
				investment_items.add(investment_item);
				investment_item.getUserInput(input);
				break;
			}
			else {
				System.out.println("select 1~4");
			}
		}
		System.out.println("Investment name:");
		String name=input.next(); 
		System.out.println("Investment amount($):");
		int amount=input.nextInt(); 
		System.out.println("Target investment period:");
		String period=input.next(); 
		System.out.println("Target return on investment(%):");
		int target=input.nextInt();
		Investment_item investment_item  =new Investment_item();
		investment_items.add(investment_item);
	}
	
	public void Delete_investment_item() {
		int index=-1;
		System.out.println("Item name");
		String name=input.next(); 
		for(int i=0;i<investment_items.size();i++) {
			if(investment_items.get(i).name==name) {
				index=i;
				break;
			}
		}
		if(index>=0) {
			investment_items.remove(index);
			System.out.println("Investment item "+name+" is deleted");
		}
		else {
			System.out.println("Investment item has not been registered");
			return;
		}
		
	}
	public void Revise_investment_item() {
		System.out.println("Item name");
		String name=input.next();
		for(int i=0;i<investment_items.size();i++) {
			//Investment_item investment_item=new investment_items.get(i);
			if(investment_items.get(i).name==name) {
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
						System.out.println("Item name:");
						investment_items.get(i).name=input.next();
					}
					else if (num==2) {
						System.out.println("Investment amount($):");
						investment_items.get(i).amount=input.nextInt(); 
					}
					else if (num==3) {
						System.out.println("Target investment period:");
						investment_items.get(i).period=input.next();
					}
					else if (num==4) {
						investment_items.get(i).period=input.next(); 
						System.out.println("Target return on investment(%):");
					}
					else  {
						continue;
					}
				}
				break;
			}
		}	
	}
	public void View_investment_items() {
//		System.out.println("Item name");
//		String name=input.next(); 
		System.out.println("# of registered items"+ investment_items.size());
		for(int i=0;i<investment_items.size();i++) {
			investment_items.get(i).printinfo() ;
		}
	}
	public void Compare_with_other_Investment_item() {
		
	} 
	
}
