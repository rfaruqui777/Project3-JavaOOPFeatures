package OOP.polymorphism;

public class TestSummation {
	public static void main(String[] args) {
		Summation summation = new Summation();
		System.out.println(summation.addition(10,20));
		System.out.println(summation.addition(10, 20, 30));
		System.out.println(summation.addition(10, 20, 30, 40));

		ModernSummation sum = new ModernSummation();
		System.out.println(sum.addition(10,20));
		System.out.println(sum.addition(10,20,30));
	}
}
