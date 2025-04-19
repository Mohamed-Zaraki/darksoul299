package MVC1;

public class Personnne {
	
	private String Name;
	private String Prenom;
	private int Numero;
	public enum contact {
		 travail ,
		 famille ,
		 amis ,
		 collégues}
	
	
	public Personnne(String Name, String Prenom, int Numero) {
		
		this.Name = Name;
		this.Prenom = Prenom;
		this.Numero = Numero;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	};
		 
		
	
	
	
					}
