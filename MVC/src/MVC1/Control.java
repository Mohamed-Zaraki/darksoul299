package MVC1;

import java.util.ArrayList;
import java.util.List;

public class Control {

	private Utilisateur utilisateur;
	private List<Personnne> Personnes ;
	public Control(Utilisateur utilisateur)
	{
		this.utilisateur=utilisateur;
		Personnes = new ArrayList<>();
	}
	public void AjouterPersonne(Personnne Person)
	{
		Personnes.add(Person);
	}
	
	public void Supprimer(Personnne Person)
	{
		Personnes.remove(Person);
	}
	
	public void Afficher()
	{
		for(Personnne Person : Personnes)
		{
			System.out.println(Person);
		}
	}

	public List<Personnne> getPersonnes() {
		return Personnes;
	}

	public void setPersonnes(List<Personnne> personnes) {
		Personnes = personnes;
	}
	
	
	
	
}
