package deneme;

public class Student {

    private String name;
    private String no;
    private byte midterm;
    private byte participation;
    private byte finalGrade; // because final is reserved word
    private float average;
    private boolean isPassing;
    public static final byte passingGrade = 50;
    public static int numberOfStudents = 0;

    public Student(){
    	this(" ", " ", -2, -2, -2); // -2 equals exam isn't yet
    }
	
    public Student(String name, String no){
    	this(name, no, -2, -2, -2);
    }
	
    public Student(String name, String no, int midterm, int participation, int finalGrade){
    	setName(name);
    	setNo(no);
    	setMidterm(midterm);
    	setParticipation(participation);
    	setFinal(finalGrade);
    	numberOfStudents++;
    }
    
    public void setName(String s){
    	char[] chars =  new char[1000];
    	chars = s.toCharArray();
    	for (int i = 0; i < chars.length; i++){
    		if (!Character.isLetter(chars[i])){
    			s = "isimsiz";
    		}
    	}
    	name = s;
    }
    
    public void setNo(String s){
    	char[] chars = s.toCharArray();
    	if (s.length() == 9) {
    		for (int i = 0; i < chars.length; i++){
        		if (!Character.isDigit(chars[i])){
        			s = "numarasýz";
        		}
        	}
    	}
    	else {
    		s = "numarasýz";
    	}
    	no = s;
    }
    
    private byte setMark(int x){
    	if (x > -2 && x <= 100){ // -1 equals don't enter
    		return (byte) x;
    	}
    	return 0;
    }
    
    public void setMidterm(int x){
    	midterm = setMark(x);
    	countAverage();
    }
	
    public void setParticipation(int x){
    	participation = setMark(x);
    	countAverage();
    }
    
    public void setFinal(int x){
    	finalGrade = setMark(x);
    	countAverage();
    }
    
    private void countAverage(){
    	if (midterm == -1 || participation == -1 || finalGrade == -1){
    		average = 0;
    		isPassing = false;
    	}
    	else if (midterm == -2 || participation == -2 || finalGrade == -2){
    		average = 0;
    		isPassing = false;
    	}
    	average = (0.3f *(float)midterm) + (0.3f *(float)participation) + (0.4f *(float)finalGrade);
    	if ((byte)average < passingGrade){
    		isPassing = false;
    	} else {
        	isPassing = true;
    	}
    }
    
    public String getName(){
    	return name;
    }
    
    public String getNo(){
    	return no;
    }    
    
    public byte getMidterm(){
    	return midterm;
    }
    
    public byte getParticipation(){
    	return participation;
    }
    
    public byte getFinal(){
    	return finalGrade;
    }
    
    public float getAverage(){
    	return average;
    }
    
    public boolean getIsPassing(){
    	return isPassing;
    }
    
	public static void main(String[] args) {

		Student st1 = new Student("Kaan", "151180035");
		System.out.println(st1.getName());
		System.out.println(st1.getNo());
		System.out.println(st1.getMidterm());
		System.out.println(st1.getParticipation());
		System.out.println(st1.getFinal());
		System.out.println(st1.getAverage());
		System.out.println(st1.getIsPassing());
		System.out.println(numberOfStudents);

	}

}
