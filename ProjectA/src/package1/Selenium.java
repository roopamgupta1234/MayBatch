package package1;


//constructor is like method
// constructor name and class name will be same
//no need to call, as we create the object it will call automatically
//no return type


public class Selenium {
	
	
		public Selenium() {
			
		
			
			System.out.println("Default Constructor");
			
		}
		
        public Selenium(int a) {
			
			System.out.println("One parametized Constructor");
			
		}
        
        
       public Selenium(int a,int b) {
    	   this();
			
			System.out.println("Two parametized Constructor");

}
       
       public static void main(String[]args)
       
       
       {
    	   
    	   Selenium ob=new Selenium(12,23);
       Selenium ob1=new Selenium(12,23);
    	//   Selenium ob2=new Selenium();
      }
       
       
       
}


      