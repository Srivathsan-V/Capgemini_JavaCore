package capgemini.day10;


class ThreadTest extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			
			System.out.println("Thread class" + i + " " + currentThread().toString());
			try {
				currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest T1 = new ThreadTest();

		
		T1.setPriority(5);
		T1.setName("Thread1");
		
		T1.start();
        
		ThreadTest T2 = new ThreadTest();
		T2.setName("Thread2");
		
		T2.start();

	}

}
