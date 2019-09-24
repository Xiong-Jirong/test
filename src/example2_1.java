
public class example2_1 {
	public static void main(String args[])
	{
		circle circleOne,circleTow;
		circleOne = new circle();
		circleTow = new circle();
		circleOne.radius=2;
		circleTow.radius=10;
		double area=circleOne.getArea();
		System.out.println("circleOne 的面积："+area);
		area=circleTow.getArea();
		System.out.println("circleTow 的面积："+area);
	}
}
