package com.i.poec.junit;

public class Fibo {
	/**
	 * fib(n) > Integer.MAX_VALUE
	 * 
	 * 
	 * Computes the fibonacci sequence numbers.
	 * fib(n) = fib(n-1) + fib(n-2)
	 * @param n, 0 or positive integer
	 * @return int n-th number in the fibonacci sequence
	 * @throws IllegalArgumentException if n < 0
	 * @throws IllegalArgumentException if fib(n) > Integer.MAX_VALUE
	 */

	public static  int fib(int n) {
		// TODO Auto-generated constructor stub
		if(n < 0) {throw new IllegalArgumentException("n must be zero or positive");}
		if(n > 46) {throw new IllegalArgumentException("n is too big");}
		
		if(n == 0)  {return 0;	}
		if(n == 1 )  { return 1; }
		return fib(n-1)+fib(n-2);
		
		
	}

}
