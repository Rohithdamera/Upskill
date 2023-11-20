package DAY_1;
interface ex{
	public void animal();
	public void human(int a, int b);
}
class ex2 {
	public void ex2() {
		System.out.println("in the class");
		
	}
	
}
class ex3 extends ex2 implements ex {
	@Override
	public void animal() {
		System.out.println("inherited");
		
	}

	@Override
	public void human(int a, int b) {
		int z=a-b;
		System.out.println("inherited1"+z	);
		
		
		
	}

	
	
}

public class Interface_ex {

	public static void main(String[] args) {
		ex3 e = new ex3();
		e.animal();
		e.human(12, 44);
		e.ex2();

	}

}

