package polymorphism;

public class Methordoverloding {


public void father (int S){
}	
public void father(int d,int s) { 
	}
	
public static void main(String[] args) {
	
	Methordoverloding obj = new Methordoverloding ();
    obj.father(1);
    System.out.println("father has 1 son");
    obj.father(2, 1);
    System.out.println("father has two doughters");

}




}
