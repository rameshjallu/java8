package java8.com.forkjoinpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class TestForkJoinPool {

	public static void main(String[] args) {
		
		/*
		 * ExecutorService executorService=Executors.newFixedThreadPool(2);
		 * 
		 * 
		 * executorService.submit(()->{System.out.println(Thread.currentThread());});
		 * executorService.submit(()->{System.out.println(Thread.currentThread());});
		 */
		
		
		ForkJoinPool forkJoinPool=new ForkJoinPool();
		
		for(int i=0;i<32;i++) {
			System.out.println("ActiveThreadCount "+forkJoinPool.getActiveThreadCount());
			forkJoinPool.submit(()->{System.out.println(Thread.currentThread());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}});
		}
		
		System.out.println("ActiveThreadCount "+forkJoinPool.getActiveThreadCount());
		
		System.out.println("processors "+Runtime.getRuntime().availableProcessors());
		
	}
}
