package deneme;

public class C{
	public C(){
		System.out.println(1);
	}
	public C (int x){
		System.out.println(2);
	}
	public C (double x){
		System.out.println(3);
	}
	public C (Number x){
		System.out.println(4);
	}
	public C (Integer x){
		System.out.println(5);
	}
	public C (Double x){
		System.out.println(6);
	}
	public C (Object x){
		System.out.println(7);
	}
	public String toString(){
		return "Hi";
	}
	public static void main(String args[]){
		C c = new C();
		new C('x');
		new C("y");
		System.out.println(c);
	}
	
}
