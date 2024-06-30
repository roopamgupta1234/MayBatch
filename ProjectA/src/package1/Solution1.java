package package1;

public class Solution1 {
	
	int a,b,c,d,e;   //five variables
	
	public static void main (String[] args){
		
		
		Solution1 obj1 = new Solution1();
    	obj1.a=12;   //1st call
    	obj1.b=33;   //2nd call
    	obj1.c =44;    //3rd call
    	obj1.d=45;     //4th call
    	obj1.e=78;   //5th call
    	
    	
    	System.out.println("Value of a" + obj1.a);   //6th call
    	System.out.println("Value of b" + obj1.b);   //7th call
    	System.out.println("Value of c" + obj1.c);    //8th call
    	System.out.println("Value of d" + obj1.d);       //9th call
    	System.out.println("Value of e" + obj1.e);     //10th call
		
		
		
	}

}
