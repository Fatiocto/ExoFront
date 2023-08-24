package animalGeneral;

public class animalSimple {

	public static void main(String[] args) {

	}
	
	private boolean vivant;
	private int age;
	private int ageMaxi;
	public int vieillissement; 
	public String crier;
	
	public animalSimple (boolean vivant, int age, int ageMaxi, int vieillissement, String crier) {
		this.vivant = true;
		this.age = age;
		this.ageMaxi = 10;
		this.vieillissement = 1;
		this.crier = null;
		
	}
	
	public boolean isVivant () {
		return vivant;
	}
	
	public void setVivant (boolean vivant) {
		this.vivant = vivant;
	}
	
	public int getAge () {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int ageMaxi() {
		return ageMaxi;
	}
	
	public void setAgeMaxi(int ageMaxi) {
		this.ageMaxi = ageMaxi;
	}

	public int getVieillissement() {
		return vieillissement;
	}

	public void setVieillissement(int vieillissement) {
		this.vieillissement = vieillissement;
	}

	public String getCrier() {
		return crier;
	}

	public void setCrier(String crier) {
		this.crier = crier;
	}
	
	//méthodes pour vieillir, mpourir, crier et getteur et setteur
	
	public void vieillir () {
		//if (age ++1)
		
	}


	/*public int hashCode() {
		return crier.hashCode();
	}*/

	public String toString() {
		return "animalSimple [vivant=" + vivant + ", age=" + age + ", ageMaxi=" + ageMaxi + ", vieillissement="
				+ vieillissement + ", crier=" + crier + "]";
	}
	
	
	
	
	
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
	
	

}
