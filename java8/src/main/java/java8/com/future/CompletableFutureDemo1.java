package java8.com.future;

import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureDemo1 {

	public CompletableFuture<Double> getPriceAsynch(String product){
		
		CompletableFuture<Double> futurePrice=new CompletableFuture<>();
		
		new Thread(()-> {
			double price=calculatePrice(product);
			futurePrice.complete(price);
		}).start();
		
		return futurePrice;
	}
	
	public double calculatePrice(String product) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 3.0;
	}
	
	
	public static void main(String[] args) {
		
		CompletableFutureDemo1 demo1=new CompletableFutureDemo1();
		
		CompletableFuture<Double> f=demo1.getPriceAsynch("ds");
		System.out.println(new Date());
		try {
			System.out.println(new Date()+" : "+f.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
