package deneme;

public class B extends A{
	public B(){
		this(5);
	}
	public B (int x){
		System.out.print(x);
	}
	public B (char c){
		super();
	}
	public static void main(String args[]){
		new B();
		new B('a');
	}
}
