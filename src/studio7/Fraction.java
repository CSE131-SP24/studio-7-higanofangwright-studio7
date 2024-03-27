package studio7;

public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction() {
		this.numerator = 1;
		this.denominator = 1;
	}
	
	public Fraction (int n, int d) {
		this.denominator = d;
		this.numerator = n;
	}


	public int getNumerator() {
		return numerator;
	}


	public int getDenominator() {
		return denominator;
	}


	public static String print (Fraction f) {
		return f.getNumerator() + "/" + f.getDenominator();

	}

	public static Fraction multiply(Fraction f1, Fraction f2) {
		int num = f1.getNumerator() * f2.getNumerator();
		int den = f1.getDenominator() * f2.getDenominator();

		Fraction product = new Fraction(num, den);

		return product;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(2,4);
		Fraction f2 = new Fraction(4,5);
		Fraction f3 = new Fraction();
		f3 = multiply(f1, f2);
		
		System.out.println(print(f1) + " times " + print(f2) + " equals " + print(f3));
		

	}

}
