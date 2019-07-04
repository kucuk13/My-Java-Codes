package deneme;

public class Cat extends Animal {

	public void talk(){
		System.out.println("I'm a cat.");
	}
	
	public void f(){
		System.out.println("x");
	}
	
	public void f(int x){
		System.out.println("y");
	}
	
	/*
	public void climbTree(){
		System.out.println("I'm climbing.");
	}
	*/
	public static void main(String[] args){
		Cat Heathcliff = new Cat();
		Heathcliff.talk();
		Heathcliff.f();
		Heathcliff.f(5);
		//Heathcliff.greeting();
		//Heathcliff.climbTree();

		
		
	}
	
}
