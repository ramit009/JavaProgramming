package programmingKnowldege;

public class Box {

private int l,b,h;
	
	public void setDimension (int length,int breadth,int height) {
		l=length;
		b=breadth;
		h=height;
	}
	
	public void showDimension() {
		System.out.println("Length is "+ l);
		System.out.println("Breadth is "+ b);
		System.out.println("Height is "+ h);
		
	}
	
	public static void main(String[] args) {
		Box check=new Box();
		check.setDimension(5, 10, 15);
		check.showDimension();

	}
	
}
