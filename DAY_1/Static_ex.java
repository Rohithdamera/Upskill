package DAY_1;
class stats{
	int rollno;
	static String branch;
	class stat{
		public void second() {
			System.out.println(rollno+":"+branch);
		}
	}
}
public class Static_ex {

	public static void main(String[] args) {
		stats s= new stats();
		stats.stat m=s. new stat();
		s.rollno=12;
		stats.branch="mca";
		m.second();

	}

}
