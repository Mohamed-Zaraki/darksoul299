//package tp5exo2;
//
//import java.util.List;
//import java.util.ArrayList;
//
//public class Section {
//	String nom,cycle;
//	List<Groupe> groupes;
//	
//	public Section(String nom,String cycle)
//	{
//		this.nom=nom;
//		this.cycle=cycle;
//		this.groupes=new ArrayList<>();
//	}
//	
//	public void addgrp(Groupe groupe)
//	{
//		groupes.add(groupe);
//	}
//	
//	public void ajoutEtdGrp(Etudiant etudiant, String nomGroupe)throws GrpNonTrouveException
//	{
//		for (Groupe groupe : groupes) {
//            if (groupe.nomGroupe.equals(nomGroupe)) {
//                groupe.ajouterEtudiant(etudiant);
//                return;
//            }
//	}
//		throw new GrpNonTrouveException("groupe non trouvee");
//
//}
//	
//	public void suppEtdGrp(int id)throws EtdNotFoundException
//	{
//		for (Groupe groupe : groupes)
//		{
//			
//				groupe.supprimerEtudiant(id);
//			return;
//			
//		}
//		throw new EtdNotFoundException("etudiant n'existe pas");
//		
//	}
//	
//	public void changerEtd(Etudiant id,Groupe old,Groupe nouv)throws EtdNotFoundException ,GroupePleinException 
//	{
//		if(old.etudiants.contains(id)!=true)
//		{
//			if(nouv.etudiants.size()>=nouv.MaxGrp)
//			{
//				throw new GroupePleinException("groupe"+ nouv.nomGroupe + "est plein");
//			}
//			else {
//			nouv.etudiants.add(id);
//			old.etudiants.remove(id);
//			System.out.println("etudiant echange avec success");
//			}
//			
//		}
//		throw new EtdNotFoundException("etudiant pas trouve dans ancien grp");
//			
//		
//	}
//	
////	public void rechEtdGrp(int id,String nomGrp)throws EtdNotFoundException
////	{
////		for(Groupe groupe:groupes)
////		{
////				
////			}
////		}
////	}
////	
//	
//	
//	
//	
//	
//	
//	
//}
