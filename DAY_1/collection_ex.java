package DAY_1;
import java.util.ArrayList;
import java.util.Collection;

	public class collection_ex {


		public static void main(String[] args) {
			Collection<Integer> n= new ArrayList<Integer>();
			n.add(1);
			n.add(2);
			System.out.println(n);
			n.remove(1);
			System.out.println(n);
			n.add(12);
			n.add(233);
			for(int l : n) {
				System.out.println(l);
			}
			

		}

	}
