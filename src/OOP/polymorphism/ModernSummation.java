package OOP.polymorphism;

public class ModernSummation extends Summation{
	@Override 
	public int addition(int a, int b, int c) {
		int total = a + b +c - 5;
		return total;
	}
}
