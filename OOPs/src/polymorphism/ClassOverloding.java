package polymorphism;

public class ClassOverloding {
	
	
 void pan(int a) {
System.err.println(a);	
	}
 void pan(int a, int b) {
	 System.out.println(a+b);
 }
	
 void pan(int a, int b,int c) {
	 System.out.println(a*b*c);
 }
 public static void main(String[] args) {
	 ClassOverloding k = new ClassOverloding();
	 k.pan(5);
	 k.pan(5,7);
	 k.pan(5, 7, 9);
}
}
