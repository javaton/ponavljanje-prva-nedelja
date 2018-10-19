import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Unesite prvi broj: ");
		Scanner br1 = new Scanner(System.in);
		int broj1 = br1.nextInt();
		
		System.out.println("Unesite drugi broj: ");
		Scanner br2 = new Scanner(System.in);
		int broj2 = br2.nextInt(); 
		
		
		if (broj2 < broj1) {
			System.out.println("Ukoliko je prvi broj veci od drugog, brojevi ce biti zamenjeni.");
			int broj = broj2;
			broj2 = broj1;
			broj1 = broj;
		}
		
		int zbir = 0;
		
		for (int i = broj1; i <= broj2; i++) {
			zbir = zbir + i;
		}
		
		System.out.println("Zbir brojeva je " + zbir + ".");
		
	}

}
