package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		
		for(int x = 0; x <= 10; x++){
		
		System.out.println(fib(x));}
	}
			
			public static int fib(int n){
				
				if (n == 0) {
					return 0;
				}
				else if (n == 1) {
					return 1;
				}
				else {
					return ( fib(n-1) + fib(n-2));
				}
				
			}	
					
	}

