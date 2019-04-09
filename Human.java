
public class Human {

	String name;
	int age;
	String eyeColor;
	int heightInInches;
	
	
	public Human(String name, int age, String eyeColor, int heightInInches) {
		
		this.name = name;
		this.age = age;
		this.eyeColor = eyeColor;
		this.heightInInches = heightInInches;
	}
	
	public void speak() {
		
		System.out.println("My name is "+ name);
		System.out.println("My age is "+age);
		System.out.println("My height is "+heightInInches);
	}
	
	public void eat(){
		System.out.println("able to eat");
	}
	public void walk(){
		System.out.println("able to walk");
	}
	public void work(){
		System.out.println("able to work");
	}
	
}
