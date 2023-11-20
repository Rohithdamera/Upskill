package DAY_1;

//Functionlinterface having only one method in it 

@FunctionalInterface
interface dem{
	void dem(int i);
}
public class Functionlinterface {

	public static void main(String[] args) {
		dem d=(int i)->                    //lambda expression
		System.out.println(i);
		d.dem(9);



	}

}
