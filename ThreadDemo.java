package THREAD;

public class ThreadDemo {

	public static void main(String[] args)throws Exception{
		
		Thread t=Thread.currentThread();
		t.setName("this is my main thread..........");
		t.setPriority(10);
		System.out.println("now thread will sleep for 5 second..");
		System.out.println("start the class");
		for(int i=0;i<10;i++) {
			System.out.println(i);
			Thread.sleep(10);
		}
		
	}
	static void vacinationCenter()throws Exception{
		System.out.println("method called....");
		Thread.sleep(5000);
	}

}
