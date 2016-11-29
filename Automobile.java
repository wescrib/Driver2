package carPackage;

public class Automobile {
	private String make;
	private String model;
	private String color;
	private int year;
	private int hp;
	private double engineSize;
	private static int count;
	
	
	//init name to Will and age to zero
	public Automobile() {
	
	make = "Oldsmobile";
	model = "Oldsmobile";
	color = "Gray";
	year = 1972;
	hp = 10;
	engineSize = 0.0;

	}
	//init name to the given parameter name an age to the given parameter age
	//name a person, age a person
	public Automobile(String make, String model, String color, int year, int hp, double engineSize) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.hp = hp;
		this.engineSize = engineSize;
		Automobile.count++;

	}
	public String getMake() {
	return make;
	}
	public void setMake(String make) {
	this.make = make;
	}
	
	
	public String getModel() {
	return model;
	}
	public void setModel(String model) {
	this.model = model;
	}
	
	public String getColor() {
	return color;
	}
	public void setColor(String color) {
	this.color = color;
	}
	
	public int getYear() {
	return year;
	}
	public void setYear(int year) {
	this.year = year;
	}
	
	public int getHP() {
	return hp;
	}
	public void setHP(int hp) {
	this.hp = hp;
	}
	
	public double getEngineSize() {
	return engineSize;
	}
	public void setEngineSize(double engineSize) {
	this.engineSize = engineSize;
	}

	
	public static int getCount() {
		return count;
	}
	//public void setCount(int count) {
		//this.count = count;
//	}
	public String toString() {
	return "Make: " + this.make + 
			"\nModel: " + this.model + 
			"\nColor: " + this.color +
			"\nYear: " + this.year +
			"\nHorsepower: " + this.hp +
			"\nEngine Size: " + this.engineSize;
	
	}

}