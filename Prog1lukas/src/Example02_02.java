import java.util.Scanner;

public class Example02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
				
				System.out.println("skriv namn: ");
		
		String namn=input.nextLine();
		
		System.out.println(namn);
		
		System.out.println("skriv �lder: ");
		int �lder = input.nextInt();
		
		
		System.out.println("skriv l�ngd: ");
		double l�ngd = input.nextDouble();
		
		System.out.println(namn+" �r "+�lder+" �r gammal och "+l�ngd+" m l�ng" );
		System.out.println("st�mmer det?");

	}

}
