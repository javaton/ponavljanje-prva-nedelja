import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int negativni = 0;
		int pozitivni = 0;
		int parni = 0;
		int neparni = 0;
		int nula = 0;
		
		System.out.println("Unesite broj brojeva za unos!");
		Scanner unos = new Scanner (System.in);
		int kapacitet = unos.nextInt();
		
		int [] niz = new int [kapacitet];
		System.out.println("Unesite brojeve: ");
		for (int i = 0; i< kapacitet; i++) {
			niz[i]= unos.nextInt();
		}
		
		for (int i = 0; i<kapacitet; i++) {
			if (niz[i]<0)
				negativni++;
			if (niz[i] == 0)
				nula++;
			if (niz[i]>0)
				pozitivni++;
			if (niz[i]%2 == 0)
				parni++;
			if (niz[i]%2 != 0)
				neparni++;
		}
		System.out.println("Parni: " + parni);
		System.out.println("neparni: " + neparni);
		System.out.println("nula: " + nula);
		System.out.println("pozitivni: " + pozitivni);
		System.out.println("negativni: " + negativni);
		
		
			
		
	}
	
	
	}

