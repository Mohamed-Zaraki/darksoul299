package tp5exo2;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
	int id;
	String nom,prenom,email,dateNaissance;
	static List<Module> modules;
	public Etudiant()
	{
		
	}
	public Etudiant(int id,String nom,String prenom,String email,String dateNaissance)
	{
		this.id=id;
		this.nom=nom;
		this.prenom=prenom;
		this.email=email;
		this.dateNaissance=dateNaissance;
		this.modules = new ArrayList<>();
	}
	public  void ajouterModule(Module module) {
        modules.add(module);
        
    }
	
    public void passerExamen(Module mod) throws NotError{
    	if((mod.exam < 0 || mod.exam > 20 ))
    	{
    		throw new NotError("la valeur n'est valide");
    	}
 
    }
    public void passerTest(Module mod) throws NotError {
    	if((mod.test < 0 || mod.test> 20) )
    	{
    		throw new NotError("La valeur de test n'est valide");
    	}
        
    }
//	gg bro u did a good job
    
    public double calculerMoyenne() throws MoyenneException
    {
    	if (modules.isEmpty()) throw new MoyenneException("mafwtch module") ;

    	double somme = 0;
        for (Module module : modules) {
            somme += module.calculerMoyenneModule();
        }
        return somme / modules.size();
    }
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public List<Module> getModules() {
		return modules;
	}
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
   
}
