package bank;
import bank.MyDetails;
public class Icici extends MyDetails { 
	private void ifsc() {
		// TODO Auto-generated method stub 
		System.out.println("ifsc code2408");
		
	} 
	private void branch() {
		// TODO Auto-generated method stub
System.out.println("chennai"); 

	}
public void addressnis() {
	// TODO Auto-generated method stub
System.out.println(" no.3 gandhi nagar");
}
public static void main(String[] args) {
	Icici a=new Icici();
	a.address();
	a.ifsc();
	a.branch(); 
	a.name(); 
	a.adhar();
	a.pannumber();  
	a.ph();
	
	
}
}
