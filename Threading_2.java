package MultiThreading;

	import java.util.*;

	class Booking1{
		
		int ticket=100;
		
		// By Using Synchronized key work we can make it Synchronized
		
		public synchronized void  Book(String name) {
			if (ticket>0)
			System.out.println("Ticket Number "+(ticket--)+" Booked for "+name);
			else
				System.out.println("All Tickets Booked");
		}
		
		
	}

	public class Threading_2 {
	
		public static void main(String []ar) throws Exception{
			Booking1 b=new Booking1();
			
			Thread t1=new Thread(new Runnable() {
				public void run() {
					for (int i=1;i<=100;i++)
					b.Book("Prajjwal");
					
			
		}
		});
			Thread t2=new Thread(new Runnable() {
				public void run() {
					for (int i=1;i<=100;i++)
					b.Book("Riya");
					
			
		}
		});
		
			t1.start();
			t2.start();
			
			t1.join();
			t2.join();
			
		

		}
	}
