package firstpackage;

class Animal {
	void eat() {
		System.out.println("Animal is Eating");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("Dog is eating");
	}
}

public class MethodOverridingExample {
	public static void main(String[] args) {
		Dog d = new Dog();
		Animal a = new Animal();

		d.eat();
		a.eat();

		Animal a1 = new Dog();
		a1.eat();
	}
}
