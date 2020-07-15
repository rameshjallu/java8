package java8.com.future;

import java.util.concurrent.Callable;

public class Resource implements Callable<String> {

	@Override
	public String call() throws Exception {
		//System.out.println(Thread.currentThread()+" : "+Thread.currentThread().getState());

		Thread.sleep(7000);
		//System.out.println(Thread.currentThread()+" : "+Thread.currentThread().getState());

		return "resp1";
	}
	
}
