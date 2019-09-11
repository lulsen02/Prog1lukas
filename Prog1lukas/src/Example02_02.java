import java.util.Scanner;

public class Example02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
				
				System.out.println("skriv namn: ");
		
		String namn=input.nextLine();
		
		System.out.println(namn);
		
		System.out.println("skriv ålder: ");
		int ålder = input.nextInt();
		
		
		System.out.println("skriv längd: ");
		double längd = input.nextDouble();
		
		System.out.println(namn+" är "+ålder+" år gammal och "+längd+" m lång" );
		System.out.println("stämmer det?");

	}

}
