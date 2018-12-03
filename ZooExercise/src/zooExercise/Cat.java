package zooExercise;

public class Cat extends Mammals implements Sounds{
	
	/////////////Attributes/////////////
	String colour;
	
	
	////////////Constructors////////////

	public Cat(String vColour, String vSpecies, String vGender, String vType, String vName, int vWeight, int vAge) {
		super(vSpecies, vGender, vType, vName, vWeight, vAge);
		this.colour = vColour;
	}

	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}
		
	//////////////Method///////////////
	
	public String sound() {
		return "Meow";
	}
	public String toString() {
		//return " [" + colour + "," + gender + "," + species + "," + name + "," + weight + "," + age + "]";
		return "This Cat is a "+this.getSpecies()+" and it is called "+this.getName();
	}
}