package DAY_1;
class parent{
       public int parentr(int a, int b){
    	return a+b;
	}
       parent(){
    	   System.out.println("in constructor");
       }
}
class child extends parent{
	 public void parentrr() {
		 System.out.println("in child class");
	 }
	
}

public class Inheritence_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child p = new child();
		int k=p.parentr(12, 23);
		p.parentrr();
		
				System.out.println(k);
			
			
		
		
      
	}

}
