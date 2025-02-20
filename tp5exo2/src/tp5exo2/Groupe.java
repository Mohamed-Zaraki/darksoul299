package tp5exo2;
import java.util.ArrayList;
import java.util.List;
public class Groupe {
	String nomGroupe;
	List<Etudiant> etudiants;
	int MaxGrp;

	public Groupe(String nomGroupe,int MaxGrp)
	{
		this.nomGroupe=nomGroupe;
		this.etudiants = new ArrayList<>();
		this.MaxGrp=MaxGrp;

	}
	
	public void ajouterEtudiant(Etudiant et) throws GroupePleinException
	{
		if(etudiants.size()>=MaxGrp)
		{
			throw new GroupePleinException("groupe"+ nomGroupe + "est plein");
		}
		etudiants.add(et);
        System.out.println("Etudiant : " + et.getNom() + " ajouté au groupe " + nomGroupe);

	}
	
	 public boolean chercherEtudiant(Etudiant etudiant) throws EtdNotFoundException
	 {
		 if(etudiants.contains(etudiant))
		 {
			 System.out.println("Etudiant trouvé !!");
			 return true;
		 }
		 
//		 for (Etudiant etudiant : etudiants) {
//	            if (etudiant.getId() == id) {
//	                return etudiant;
//	            }
		 else
		 {
		 throw new EtdNotFoundException("Étudiant   non trouvé !");
		 }

	 }
	 
	 
	 public void supprimerEtudiant(Etudiant etudiant) throws EtdNotFoundException{
		 
			 if(etudiants.contains(etudiant)) {
		        	etudiants.remove(etudiant);
		        	System.out.println("etudiant :   supp");
		        }
			 else {
			 throw new EtdNotFoundException("etudiant pas trouve");
			 }
		 }
	       
	    

	 public void listerEtudiants() {
	        System.out.println("liste des rtudiants du groupe " + nomGroupe + ":");
	        for (Etudiant etudiant : etudiants) {
	            System.out.println(etudiant.getNom() + " " + etudiant.getPrenom());
	        }

	    }

}
