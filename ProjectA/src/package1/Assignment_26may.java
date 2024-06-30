package package1;

public class Assignment_26may {
	                                  //(((((10+2)+2)-2)*2)/2)
	
	public int sum (int a, int b)
	{
		
		int c;
		c =a+b;
		System.out.println("sum result is "+ c);
		return c;	
		
	}

	
	
	public int sub(int x, int y) {
		
		int z;
		z=x-y;
		System.out.println("sub result is "+ z);
		return z;
	}
	
   public int multi(int x, int y) {
		
		int z;
		z=x*y;
		System.out.println("multi result is "+ z);
		return z;
	}
	
	
	
	public void div(int a, int b)
	{
		
		int result;
		result =a/b;
		System.out.println("final result is " + result);

    }
	
	

	public static void main(String[]args) {
		Assignment_26may ob =new Assignment_26may();
		int sumResult= ob.sum(10,2);
		int sumResult1= ob.sum(sumResult,2);
		
		int subResult= ob.sub(sumResult1, 2);
		
		int multiResult=ob.multi(subResult,2);
		
		ob.div(multiResult,2);
		
		
		
		
	}
}