
public class CalculateArea {

	public static void main(String[] args) 
		{
			double circleAreaInMainMethod= CalculateCircleArea(10);
			double secondCircleArea = CalculateCircleArea(5);
			System.out.println("Area of the circle is " + circleAreaInMainMethod);
			System.out.println("Area of the circle is " + secondCircleArea);
			
			System.out.println("I am going to calculate the area of a rectangle");
			double rectangleAreaInMainMethod = AreaRect (2, 3);
			System.out.println("Area of the rectangle is " + rectangleAreaInMainMethod);
	}
		
		public static double CalculateCircleArea(int radius)
		{
			//This method calculates the area of circle
			//Input: integer radius value
			//Output: double area
			
			double area = 3.14 * radius * radius;
			return area;
		}


	public static double AreaRect(int width, int length){
		
		double area= length * width;
		return area;
	}
}