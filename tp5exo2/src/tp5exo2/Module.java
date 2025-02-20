package tp5exo2;

public class Module {
	String nom;
	int credit;
	double test,exam,tp;
	
	public Module(String nom, int credit, double test, double exam, double tp) {
        this.nom = nom;
        this.credit = credit;
        this.test = test;
        this.exam = exam;
        this.tp = tp;
    }
	
	public double calculerCC()
	{
		double noteCC=(tp+test)/2;
		
		return noteCC;
	}
	public double calculerMoyenneModule()
	{
		double noteCC = calculerCC();
		double MoyenneModule=noteCC*0.4+exam*0.6;
		return MoyenneModule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public double getTest() {
		return test;
	}

	public void setTest(double test) {
		this.test = test;
	}

	public double getExam() {
		return exam;
	}

	public void setExam(double exam) {
		this.exam = exam;
	}

	public double getTp() throws NotError {
		return tp;
	}

	public void setTp(double tp) {
		this.tp = tp;
	}
	

}
