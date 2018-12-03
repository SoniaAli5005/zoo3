package zooExercise;

public abstract class Mammals extends Animals {

	////////////Attributes/////////////
	
	private String species; 
	private String gender;
	
	///////////Constructors////////////
	public Mammals(String vSpecies, String vGender, String vType, String vName, int vWeight, int vAge) {
		super(vType, vName, vWeight, vAge);
		this.species = vSpecies;
		this.gender = vGender;
	}
	
	/////////////Methods/////////////

	public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

}