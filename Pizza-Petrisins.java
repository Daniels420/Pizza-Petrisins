import java.text.DecimalFormat;
public class Pizza-Petrisins {
	public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat("#.##");
	Scanner scan = new Scanner(System.in);
	
	//Mainîgie
	DecimalFormat df = new DecimalFormat("#.##");
	Scanner scan = new Scanner(System.in);
	String vards; //Pirmais pasûtîtâja vârds
	char picas veids; 
	String veids; //Veida nosaukums
	int cm; //Picas izmçrs
	double apmaksa = 0.0; //picas apmaksa
	double summa; //apmaksa kopâ ar piedevâm
	double cena; //Picas cenas(kopçjâ)
	int piedeva1 = 0; //Pirmâ piedeva (Pepperoni)
	int piedeva2 = 0; //Otrâ piedeva (Guríi)
	int piedeva3; //Kopâ piedevas
	String piedeva = "Siers"; //Automâtiskâ piedeva
	System.out.println("Ievadiet savu Vârdu un Uzvârdu: );"
	Vards = keyboard.nextLine();
	
	//Picas cenas
	System.out.println("Kâda izmçra picu jûs vçlçtos?(1| 20(cm); 2| 30 (cm); 3| 40 (cm); 4| 50 (cm): );"
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
		System.out.println("Cipars kuru jûs ievadîjât ir nederîgs,lûdzu ievadiet picas izmçru:  ");
		keyboard.nextLine();
		
		// Picas veids
		System.out.println("Kâdu picu jûs vçlaties?: 1)Pizza Margherita (PM); 2)Pizza Marinara (PMA); 3)Margharita extra (MEX) :  ");
		if (picas veids == 'PM' || picas veids == 'pm' ) {
			veids = "Pizza Margharita";}
		else if (picas veids == 'PMA' || picas veids == 'pma') {
			veids = "Pizza Marinara";}
		else if (picas veids == 'MEX' || picas veids == 'mex' ) {
			veids = "Margharita extra";}
		
		//Picas piedevas
		System.out.println("Visâm picâm nâk klât siers.");
		System.out.println("Katra nâkoðâ piedeva maksâ 3.00 eiro, izvçlaties: Pepperoni vai Guríi.");
		
		//Pepperoni
		System.out.println("Vai jûs vçlaties Pepperoni? (Jâ/Nç)");
		piedeva1 = keyboard.nextLine().charAt(0);
		if (piedeva1 == 'Jâ' || piedeva1 == 'JÂ') {
			piedeva1 = 1;
			piedeva = piedeva + " un Pepperoni";}
		else {
			piedeva1 = 0;
		}
		
		//Guríi
		System.out.println("Vai jûs vçlaties Guríus? (Jâ/Nç)");
		piedeva2 = keyboard.nextLine().charAt(0);
		if (piedeva2 == 'Jâ' || piedeva2 == 'JÂ') {
			piedeva2 = 1;
			piedeva = piedeva + " un guríi";}
		
		piedeva3 = (piedeva1) + (piedeva2);
		
		//Pasûtîjuma apmaksas aprçíinâðana
		
		summa = (apmaksa) + (piedeva3 * 1.25);
		System.out.println(Vards + ",ðeit bûs jûsu pasûtîjums:  ");
		System.out.println(cm + "cm pizza");
		System.out.println(piedeva + " + piedeva");
		System.out.println("Pasûtîjums maksâ: eiro" + df.format(cena));
		
		
		
		}
		}
		}
	
	
	
}