package java8.com.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletableFutureDemo {

	static CompletableFuture<String> completableFuture = null;
	
	public static String getResp() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "resp1";
	}
	
	public static void getFutureComplete() {
		
		CompletableFuture<String> completableFuture1=new CompletableFuture<>();
		
		String resp=getResp();
		
		completableFuture1.complete(resp);
		
		completableFuture=completableFuture1;
	}
	public static void main(String[] args) {
		
		
		
		System.out.println("before get");
		
		new Thread(()-> {
			
			getFutureComplete();
			
			System.out.println("after get");
			
			
		}).start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(completableFuture.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("in main last");
		

	}
}
