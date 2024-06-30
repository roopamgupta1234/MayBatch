package package1;
                                                //(((((10*2)-2)+2)-2)/2)
public class Assignment1_26may {
	
	
	public int multi (int a, int b) {
	int c;
	c =a*b;
	System.out.println("multi result is "+ c);
	return c;	
	
    }



    public int sub(int x, int y) {
	
	int z;
	z=x-y;
	System.out.println("sub result is "+ z);
	return z;
   
    }

    public int sum(int x, int y) {
	
	int z;
	z=x+y;
	System.out.println("sum result is "+ z);
	return z;
   
    }



   public void div(int a, int b) {
	
	int result;
	result =a/b;
	System.out.println("final result is " + result);

   }
   

   public static void main(String[]args) {
	   
	   
	   Assignment1_26may ob=new Assignment1_26may();
	   int MultiResult= ob.multi(10,2);
	   int SubResult= ob.sub(MultiResult, 2);
	   int SumResult =ob.sum(SubResult,2);
	   
	   int SubResult1 = ob.sub(SumResult,2);
	   
	   ob.div(SubResult1,2);
	   
	   
   }	   

	
}
