package studio7;

public class die {

	private int sides;
	
	public die (int Sides) {
		this.sides = Sides;		
	}
	
	public static void roll(die d, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println((int) (Math.random()* d.getSides()) + 1);
		}
		System.out.println();
	}
	
	public int getSides() {
		return this.sides;
	}

	public static void main (String[] args) {
		die d6 = new die (6);
		die d20 = new die (20);
		
		roll(d6,10);
		roll(d20,20);
	}
	
}
