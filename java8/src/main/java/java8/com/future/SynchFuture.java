package java8.com.future;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class SynchFuture {

	public static void main(String[] args) {
		

		
		//System.out.println(Thread.currentThread()+" : "+Thread.currentThread().getState());

		ExecutorService executorService=Executors.newFixedThreadPool(1);
		
		System.out.println(new Date()+" before future obj ");
		
		Future<String> f=executorService.submit(new Resource());
		
		System.out.println(new Date()+" after future obj "+f);
		
		try {
			
			String res=f.get();
			System.out.println(new Date()+" after future get ");
			
			System.out.println(res);
			
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(Thread.currentThread()+" : "+Thread.currentThread().getState());

	
	}
}
