package package1;

public class Assignment_1june {
		
		
		public Assignment_1june(){
			
		this(12,123,23);
			
			System.out.println("Default Constructor");
			
		}
		
        public Assignment_1june (int a) {
			
			System.out.println("One parametized Constructor");
			
		}
        
        
       public Assignment_1june (int a,int b) {
    	  
			
			System.out.println("Two parametized Constructor");
       }	
			
       public Assignment_1june (int a,int b,int c) {
		   
					
					System.out.println("Three parametized Constructor");	

}
       
       public static void main(String[]args)
       
       
       {
    	   Assignment_1june  ob4= new Assignment_1june ();
    	   Assignment_1june  ob=new Assignment_1june (12);
    	   Assignment_1june  ob1=new Assignment_1june (12,23787897);
    	 
    	 
      }

}
