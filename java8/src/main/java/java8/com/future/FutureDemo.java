package java8.com.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FutureDemo {

	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread()+" : "+Thread.currentThread().getState());

		//ExecutorService executorService=Executors.newFixedThreadPool(1);
		
		//Future<String> f=executorService.submit(new Resource());
		
		Callable<String> c=new Resource();
		FutureTask<String> f=new FutureTask<>(c);
		
		new Thread(f).start();
		
		try {
			
			//executorService.shutdownNow();
			
			System.out.println(Thread.currentThread()+" : "+Thread.currentThread().getState());
			String res=f.get();
			System.out.println(Thread.currentThread()+" : "+Thread.currentThread().getState());

			System.out.println(res);
			
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread()+" : "+Thread.currentThread().getState());

	}
}
