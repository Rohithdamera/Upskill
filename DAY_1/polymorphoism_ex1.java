package DAY_1;

class overload{
	public void ex() {
		System.out.println("1st");
	}
}
class overload1 extends overload {
	@Override
	public void ex() {
		System.out.println("2nd");
	}
}
class override extends overload{
	public void ex() {
		System.out.println("3rd");
	}
	public void ex2(int x , int y) {
		int z=x+y;
		System.out.println(z);
	}
	public void ex2(double x , int y, int z) {
		double u=x+y+z;
		System.out.println(u);
	}
}
public class polymorphoism_ex1 {

	public static void main(String[] args) {
		overload w = new overload();
		w.ex();
		overload1 o = new overload1();
		o.ex();
		override x= new override();
		x.ex();
		x.ex2(32.4,44, 98);
		x.ex2(12, 340);

	}

}
