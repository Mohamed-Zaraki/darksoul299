package tp2exo2;

public class Main {
	public static void main(String[] args) {
		
		View view =new View();
		Contact contact = new Contact();
		new ContactController(view , contact);
	}
	
}
