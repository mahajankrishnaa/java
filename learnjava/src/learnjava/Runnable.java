package learnjava;

class ThreadR implements Runnable
{
	//Override 
	public void run() {
		for(int i=1;i<=10;i++)
			System.out.print(i+" ");
	}
}
public class Runnable {
	public static void main(String[] args) {
		ThreadR t1 = new ThreadR();// no output as t.start is used 
		Thread t = new Thread(t1);// pass runnable object through new thread class object
		t.start();

	}

}
