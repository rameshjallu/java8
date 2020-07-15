package java8.com.asynchvsparallel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class AsynchVsParallel {

	public static void main(String[] args) {

		System.out.println("ok");

		List<Product> list = new ArrayList<>();

		for (int i = 1; i <= 90_000; i++) {

			list.add(new Product(i, "product" + i));
		}

		long time1 = System.currentTimeMillis();

		getPriceParallel(list, null);

		long time2 = System.currentTimeMillis();

		System.out.println(time2 - time1 + " ms");

		long time3 = System.currentTimeMillis();

		getPriceAsynch(list, null);

		long time4 = System.currentTimeMillis();

		System.out.println(time4 - time3 + " ms");

		long time5 = System.currentTimeMillis();

		getPriceAsynchParallel(list, null);

		long time6 = System.currentTimeMillis();

		System.out.println(time6 - time5 + " ms");

	}

	public static List<String> getPriceAsynch(List<Product> list, String product1) {

		List<CompletableFuture<String>> priceFutures = list.stream()
				.map(product -> CompletableFuture.supplyAsync(() -> product.name)).collect(Collectors.toList());

		return priceFutures.stream().map(CompletableFuture::join).collect(Collectors.toList());

	}

	public static List<String> getPriceAsynchParallel(List<Product> list, String product1) {

		List<CompletableFuture<String>> priceFutures = list.parallelStream()
				.map(product -> CompletableFuture.supplyAsync(() -> product.name)).collect(Collectors.toList());

		return priceFutures.stream().map(CompletableFuture::join).collect(Collectors.toList());

	}

	public static List<String> getPriceParallel(List<Product> list, String name) {

		return list.parallelStream().map(product -> product.name).collect(Collectors.toList());

	}

	public static List<Double> getPriceSeq(List<Product> list, String name) {

		return list.parallelStream().map(Product::getPrice).collect(Collectors.toList());

	}
}
