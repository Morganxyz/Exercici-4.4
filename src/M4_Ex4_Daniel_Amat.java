import java.util.Scanner;

public class M4_Ex4_Daniel_Amat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mes = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escull un mes entre 1 i 12: ");
		mes = entrada.nextInt();
		
		
		
		switch(mes) {
		case 1:
			System.out.println("El mes de gener te 31 díes");
			break;
		case 2:
			System.out.println("El mes de febrer te 28 díes");
			break;
		case 3:
			System.out.println("El mes de març te 31 díes");
			break;
		case 4:
			System.out.println("El mes de abril te 30 díes");
			break;
		case 5:
			System.out.println("El mes de maig te 31 díes");
			break;
		case 6:
			System.out.println("El mes de juny te 30 díes");
			break;
		case 7:
			System.out.println("El mes de juliol te 31 díes");
			break;
		case 8:
			System.out.println("El mes de agost te 31 díes");
			break;
		case 9:
			System.out.println("El mes de setembre te 30 díes");
			break;
		case 10:
			System.out.println("El mes de octubre te 31 díes");
			break;
		case 11:
			System.out.println("El mes de novembre te 30 díes");
			break;
		case 12:
			System.out.println("El mes de desembre te 31 díes");
			break;
		default:
			System.out.println("El número de mes es incorrecte.");
		}
		
	}

}
