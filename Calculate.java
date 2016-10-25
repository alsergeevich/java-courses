import java.util.Scanner;
public class Calculate {
	
	public static void main (String[] args) {
		
	try{	
		String exit = "no";
		Scanner scanner = new Scanner(System.in);
		Calc calc = new Calc();
		double rez = 0;
		int deysvie;
		double a;
		double b;
		while( !exit.equals("yes")){
			System.out.println("Input first number:");
			a = scanner.nextDouble();
			System.out.println("Input second number:");
			b = scanner.nextDouble();
			System.out.println("Select app: ");
			System.out.println();
			System.out.println("1. Summ");
			System.out.println("2. Minus");
			System.out.println("3. Umnojenie");
			System.out.println("4. Delenie");
			deysvie = scanner.nextInt();
			if(deysvie == 1) rez = calc.plus(a, b);
			if(deysvie == 2) rez = calc.minus(a,b);
			if(deysvie == 3) rez = calc.umnoj(a, b);
			if(deysvie == 4) rez = calc.delenie(a, b);
			System.out.println("Rezultat = " + rez);
			System.out.println("Exit yes/no");
			exit = scanner.next();
		}
	}finally {
		return;
	}
		
		
		
		
	}
}