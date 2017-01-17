
package assignment.pkg1;

public class Assignment1 {

        byte a = 50;
	short b = 1000;
	int c = 15000;
	long d = 1000L;
	float e = 10.56f;
	double f = 123.456;
	boolean g = true;
	char h = 'J';
	
	void print() {
		
		System.out.println("The Byte Value is : " + a);
		System.out.println("The Short Value is : " + b);
		System.out.println("The Short Value is : " + c);
		System.out.println("The Short Value is : " + d);
		System.out.println("The Short Value is : " + e);
		System.out.println("The Short Value is : " + f);
		System.out.println("The Short Value is : " + g);
		System.out.println("The Short Value is : " + h);
        }

public static void main(String[] args) {
        
        Assignment1 obj = new Assignment1();

	obj.print();
}
}