package zooExercise;

public abstract class Animals {

	//////////Attributes///////////
	
	private String type;
	private String name;
	private int weight;
	private int age;
	
	/////////Constructors/////////
	
	public Animals(String vType, String vName, int vWeight, int vAge) {
		this.type = vType;
		this.name = vName;
		this.weight = vWeight;
		this.age = vAge;
	}

	/////////Method//////////////
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}