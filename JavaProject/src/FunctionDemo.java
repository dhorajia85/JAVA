
public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println 	("Area of Rectangle : " + RectangleArea(15,10));
		System.out.println 	("Percentage of Rectangle : " + RectanglePercentage(15,10));
	}

	public static int RectangleArea(int length, int breadth)
	{
		return length * breadth;
	}
	
	public static int RectanglePercentage (int length, int breadth)
	{
		return 2 * (length + breadth);
				
	}
}
