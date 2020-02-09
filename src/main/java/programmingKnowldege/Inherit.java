package programmingKnowldege;

class Super {
	int j,k;
	
	public void addNumbers(int x , int y) {
	j=x;
	k=y;		
}}


class Base extends Super {		
	int total;
	
	public void result () {
		
		total= j+k;
	}

}


public class Inherit {

	public static void main(String[] args) {
		Base ob = new Base();
		ob.addNumbers(10, 20);
		ob.result();
		System.out.println(ob.total);
		

	}
}
