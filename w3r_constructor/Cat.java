package w3r_constructor;

public class Cat {
	private String name;
	private int age;
	
	public Cat(){
		this.name = "Unknown";
		this.age = 0;
	}
	
	
	public static void main(String[] args) {
		Cat c1 = new Cat();
		System.out.println("Cat name: "+c1.name);
		System.out.println("Cat age: "+c1.age);
	}
}


