package abc;

public class Fib {
	
	public static void main(String[] args) {
		
		//print 0 to 100 range fib series
		
		int a=0,b=1;
		
		while(a<=100) {
			
			System.out.println(a);
			int temp=a+b;
			a=b;
			b=temp;
			
		}
		
	}

}
