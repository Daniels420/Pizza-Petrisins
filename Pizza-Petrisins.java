import java.text.DecimalFormat;
public class Pizza-Petrisins {
	public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat("#.##");
	Scanner scan = new Scanner(System.in);
	
	//Main�gie
	DecimalFormat df = new DecimalFormat("#.##");
	Scanner scan = new Scanner(System.in);
	String vards;
	char picas veids;
	String veids;
	int cm;
	double apmaksa = 0.0;
	double summa;
	double cena;
	int piedeva1 = 0;
	int piedeva2 = 0;
	int piedeva3;
	String piedeva = "Siers";
	System.out.println("Ievadiet savu V�rdu un Uzv�rdu: );"
	Vards = keyboard.nextLine();
	
	//Picas cenas
	System.out.println("K�da izm�ra picu j�s v�l�tos?(1| 20(cm); 2| 30 (cm); 3| 40 (cm); 4| 50 (cm): );"
		cm = keyboard.nextInt();
		if (cm == 20 ){
			apmaksa = 15.00; }
		else if (cm == 30 ) {
			apmaksa = 24.00; }
		else if (cm == 40 ); }
	apmaksa = 30.00; {
	else if (cm == 50 ); }
	apmaksa = 35.00; {
	else if (cm !=20 && cm !=30 && cm !=40 && cm !=50) {
		System.out.println("Cipars kuru j�s ievad�j�t ir neder�gs,l�dzu ievadiet picas izm�ru:  ");
		keyboard.nextLine();
		
		// Picas veids
		System.out.println("K�du picu j�s v�laties?: 1)Pizza Margherita (PM); 2)Pizza Marinara (PMA); 3)Margharita extra (MEX) :  ");
		if (picas veids == 'PM' || picas veids == 'pm' ) {
			veids = "Pizza Margharita";}
		else if (picas veids == 'PMA' || picas veids == 'pma') {
			veids = "Pizza Marinara";}
		else if (picas veids == 'MEX' || picas veids == 'mex' ) {
			veids = "Margharita extra";}
		
		//Picas piedevas
		System.out.println("Vis�m pic�m n�k kl�t siers.");
		System.out.println("Katra n�ko�� piedeva maks� 3.00 eiro, izv�laties: Pepperoni vai Gur�i.");
		
		//Pepperoni
		System.out.println("Vai j�s v�laties Pepperoni? (J�/N�)");
		piedeva1 = keyboard.nextLine().charAt(0);
		if (piedeva1 == 'J�' || piedeva1 == 'J�') {
			piedeva1 = 1;
			piedeva = piedeva + " un Pepperoni";}
		else {
			piedeva1 = 0;
		}
		
		//Gur�i
		System.out.println("Vai j�s v�laties Gur�us? (J�/N�)");
		piedeva2 = keyboard.nextLine().charAt(0);
		if (piedeva2 == 'J�' || piedeva2 == 'J�') {
			piedeva2 = 1;
			piedeva = piedeva + " un gur�i";}
		
		piedeva3 = (piedeva1) + (piedeva2);
		
		
		
		
		}
		}
		}
	
	
	
}