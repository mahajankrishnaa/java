// Ploymorphism
package learnjava;

class Base {
	int i;
	int j;
	void input(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	void display()
	{
		System.out.println("i="+i+" "+"j="+j);
	}
}
class Derived extends Base {
	int k;
	void input(int k) {
		this.k=k;
	}
	void display() {
		super.display();
		System.out.println("k="+k);
	}
}
public class Inheritance {
	  public static void main(String[] args) {
		   Base b =new Base();
		   b.input(10,20);
		   b.display();
		   
		   Derived d= new Derived();
		   d.input(30,40); //wil go to base class as two args are passed 
		   d.display();
		   d.input(50);
		   d.display();
	  }
}