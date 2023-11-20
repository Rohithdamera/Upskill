package DAY_1;

import java.util.Scanner;

class demo{
demo(int rollno, int marks, String branch, String name ){
	System.out.println(rollno+":"+marks+":" +branch+":" +name);
}
}
class demo1{
	private String username;
	private String password;
	public void credientails() {
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		}

public class class_ex {

	public static void main(String[] args) {
		demo d= new demo(21, 2334, "mca","user" );
		demo1 e= new demo1();
		 
		System.out.println("enter the user name");
		Scanner l= new Scanner (System.in);
		String p=l.nextLine();
	   e.setUsername(p);
	   System.out.println(e.getUsername());
 
	}

	private static void demo1() {
		// TODO Auto-generated method stub
		
		
	}

}
