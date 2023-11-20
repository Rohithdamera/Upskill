package DAY_1;
class class1{
	class class2{
		public int class2(int i, int j) {
			// TODO Auto-generated method stub
			return i+j;
			// System.out.println("in inner class");
		}
	}
}
public class class_ex2 {

	public static void main(String[] args) {
		class1 a= new class1();
		class1.class2 b=a.new class2();
	     int s= b.class2(1,2);
         System.out.println(s);
}
}