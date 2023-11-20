package DAY_1;

import java.util.Scanner;

abstract class abst{
	public abstract void ex();

     abst(){
     System.out.println("hi");
      }
}
     class abstt extends abst{

		@Override
		public void ex() {
			int count=0 ;
			System.out.println("eneter the size of array");
			Scanner s= new Scanner (System.in);
			int k= s.nextInt();
			int [] l=new int[k];
			System.out.println("enter the values");
			for(int i=0; i<k;i++) {
				l[i]=s.nextInt();
				}
			System.out.println(" the values are");
			
			for(int i=0; i<k;i++) {
				
				count=count+l[i];
				System.out.println(l[i]);
				
				}
			System.out.println("Total"+count);
			
		}
    	
     }

public class Abstract_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abst a = new abstt();
		a.ex();
	}
}


