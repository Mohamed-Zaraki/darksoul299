package tp5exo2;

public class Main {
    public static void main(String[] args) {
        Groupe groupe1 = new Groupe("Grp A",2);
        Etudiant et1 = new Etudiant(1, "Yacine", "test", "yacine@email.com", "01/01/2001");
        Etudiant et2 = new Etudiant(2, "Goudjil", "Prenom", "Goudjil@email.com", "05/05/2005");
        Etudiant et3 = new Etudiant(3 , "chebouba" ,"Amine" , "amine@gmail" , "amliha");
        Module mod1 = new Module("POO", 6, -8, 106, -8);
        Module mod2 = new Module("RI", 4, 7, 29.5, -9);
        et1.ajouterModule(mod1);
        et1.ajouterModule(mod2);
        
        
        try
        {
        et1.passerExamen(mod2);
        et1.passerExamen(mod1);
        }
        catch(NotError e)
        {
        	System.out.println(e);
        }
        
        
        try {
            groupe1.ajouterEtudiant(et1);
            groupe1.ajouterEtudiant(et2);
        }
          catch (GroupePleinException e)
        {
        	  System.out.println(e);
        }
            System.out.println("Liste des etudiants:");
            groupe1.listerEtudiants();
            
            
            try
            {
            groupe1.supprimerEtudiant(et2);
            groupe1.listerEtudiants();
            }
            catch(EtdNotFoundException e)
            {
            	System.out.println(e);
            }

            
            try
            {
            	
            System.out.println("Moyenne générale de " + et1.nom + " : " + et1.calculerMoyenne());
            }
            catch(MoyenneException e)
            {
            	System.out.println(e);
            }
            
            
            try
            {
            if(groupe1.chercherEtudiant(et3))
            {
            	System.out.println("L' Etudiant est dans  le groupe ");
            }
            }
            catch(EtdNotFoundException e)
            {
            	System.out.println(e);
            }
            
            
            
        }

}
