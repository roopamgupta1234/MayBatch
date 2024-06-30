package package1;

public class Solution3 {
	
	int a,b,c,d,e;

	
	public Solution3 (int x1, int x2, int x3, int x4, int x5) {
	

		a=x1;
		b=x2;
		c=x3;
		d=x4;
		e=x5;
	}
		
	public static void main(String[] args) {
		
		Solution3 obj =new Solution3(11,11,111,1111,111);
		
			System.out.println(obj.a);    //1st call
			System.out.println(obj.b);    //2nd call
			System.out.println(obj.c);     //3rd call
			System.out.println(obj.d);     //4th call
			System.out.println(obj.e);    //5th call
			
			
		}
		

}
