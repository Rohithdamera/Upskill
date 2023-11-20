package DAY_1;



class in{
	public void show() {
		//super.show();
		System.out.println("parent class");
	}
}
class inn extends in{
	public void show() {
		super.show();
		System.out.println("child class");  //if u print only inner class then rempove super line
	}
}

class anna{
	public  void  ann() {
		System.out.println("example");
	}
	
}
public class Anonomusclass {

	public static void main(String[] args) {
		new anna().ann();

		
		inn i = new inn() {
			
			
			public void show() {
				super.show();
				System.out.println("inner class");
			}
			
			};
			i.show();
		}
	}


