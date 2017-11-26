package com.eample;

import java.util.stream.Stream;

public class Fib {
	  public static void main(String[] args) {
		  Stream<Long> factorialStream = FibonacciSupplier.factorialStream();
	    factorialStream.limit(1).forEach(System.out::println);
	  }
	}
