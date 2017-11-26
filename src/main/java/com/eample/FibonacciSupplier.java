package com.eample;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class FibonacciSupplier{
	
	
	public static Stream<Long> factorialStream() {
		return Stream.generate(new Supplier<Long>() {
			@Override
			public Long get() {
				return (long) luoBo(10);
			}});
	}
	
	/**
	 * 使用递归解决
	 * */
	public static int luoBo(int num){
		if(num==1){
			return 1;
		}
		if (num==2){
			return 2;
		}
		if(num==3) {
			return 4;
		}
		return luoBo(num-1)+luoBo(num-2)+luoBo(num-3);
	}	
}
