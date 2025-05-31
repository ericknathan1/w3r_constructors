package w3r_constructor;

public class Dog {
	
	private String name;
	private String color;
	
	public Dog(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public static void main(String[] args) {
		Dog d1 = new Dog("Bolt","white");
		System.out.println("Dog name: "+d1.name);
		System.out.println("Dog color: "+d1.color);
	}
}
