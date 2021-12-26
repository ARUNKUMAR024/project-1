package bank;
public class Hdfc extends MyDetails { 
	private void ifsc() {
		// TODO Auto-generated method stub 
		System.out.println("ifsc code2408");
		

	} 
	private void branch() {
		// TODO Auto-generated method stub
System.out.println("chennai"); 

	}
public void address() {
	// TODO Auto-generated method stub
System.out.println(" no.3 gandhi nagar");
}
public static void main(String[] args) {
	Hdfc c= new Hdfc();
	c.address();
	c.ifsc();
	c.branch(); 
	c.name();
	c.pannumber();
	c.adhar(); 
	c.ph();
	
}

}
