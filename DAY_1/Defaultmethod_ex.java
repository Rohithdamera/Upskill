package DAY_1;
interface exa{
	void ex();
	default void ex1() {
		System.out.println("in interface ");
	}
}
class childd implements exa{
	public void ex() {
		System.out.println("in child 1");
	}
	public void ex1() {
		System.out.println("in child 2");
	}
}
public class Defaultmethod_ex {

	public static void main(String[] args) {
		childd c= new childd ();
		exa e = new childd();
		e.ex1();
		e.ex();
		c.ex();
		c.ex1();

	}

}
