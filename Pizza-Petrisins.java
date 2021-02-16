import java.text.DecimalFormat;
public class Pizza-Petrisins {
	public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat
	Scanner scan = new Scanner(System.in);
	
	//Mainîgie
	DecimalFormat df = new DecimalFormat("#.##");
	Scanner keyboard = new Scanner(System.in);
	String vards; //Pirmais pasûtîtâja vârds
	char picasveids; 
	String picasnosaukums; //Veida nosaukums
	int cm; //Picas izmçrs
	double picascena = 0.0; //picas apmaksa
	double VPN = 0.08;
	double summa; //apmaksa kopâ ar piedevâm
	double cena; //Picas cenas(kopçjâ)
	double kopa1;
	double kopa2;
	int peperroni = 0; //Pirmâ piedeva (Pepperoni)
	int gurki = 0; //Otrâ piedeva (Guríi)
	int piedeva3; //Kopâ piedevas
	String siers = "Siers"; //Automâtiskâ piedeva
	System.out.println("Ievadiet savu Vârdu un Uzvârdu: );"
	vards = keyboard.nextLine();
	
	//Piegâde
	double distance = 0;
	double piegade  = 0;
	System.out.println("Ievadiet savu attâlumu no mûsu picas veikala(0,ja atrodaties mûsu çkâ):  ");
	distance = keyboard.nextDouble();
	if (distance == 0) {
		piegade = 0;
		System.out.println("Jums nav jâapmaksâ piegâde.");
		else if(distance > 1) {
			piegade = ((distance * 0.5)+2);
			System.out.println("Jums par piegâdi jâsamaksâ: €"+ df.format(piegade));}
		else if(distance > 0) {
			piegade = 2.00;
			System.out.println("Jums par piegâdi jâsamaksâ: €"+ df.format(piegade));}
		}
	
	
	
	//Picas cenas
	System.out.println("Kâda izmçra picu jûs vçlçtos?(1| 20(cm); 2| 30 (cm); 3| 40 (cm); 4| 50 (cm): );"
		cm = keyboard.nextInt();
		if (cm == 20 ){
			picascena = 15.00; }
		else if (cm == 30 ) {
			picascena = 24.00; }
		else if (cm == 40 ); }
	        picascena = 30.00; {
	    else if (cm == 50 ); }
	        picascena = 35.00; {
	    else if (cm !=20 && cm !=30 && cm !=40 && cm !=50) {
		System.out.println("Cipars kuru jûs ievadîjât ir nederîgs,automâtiski izvçlçts 20 (cm).");
		picascena = 20;}
		keyboard.nextLine();
		
		// Picas veids
		System.out.println("Kâdu picu jûs vçlaties?: 1)Pizza Margherita (PM); 2)Pizza Marinara (PMA); 3)Margharita extra (MEX) :  ");
		if (picasveids == 'PM' || picasveids == 'pm' ) {
			picasnosaukums = "Pizza Margharita";}
		else if (picasveids == 'PMA' || picas veids == 'pma') {
			picasnosaukums = "Pizza Marinara";}
		else if (picasveids == 'MEX' || picas veids == 'mex' ) {
			picasnosaukums = "Margharita extra";}
		
		//Picas piedevas
		System.out.println("Visâm picâm nâk klât siers.");
		System.out.println("Katra nâkoðâ piedeva maksâ 3.00 eiro, izvçlaties: Pepperoni vai Guríi.");
		
		//Pepperoni
		System.out.println("Vai jûs vçlaties Pepperoni? (Jâ/Nç)");
		peperroni = keyboard.nextLine().charAt(0);
		if (peperroni == 'Jâ' || peperroni == 'JÂ') {
			piedeva1 = 1;
			siers = siers + " un Pepperoni";}
		else {
			piedeva1 = 0;
		}
		
		//Guríi
		System.out.println("Vai jûs vçlaties Guríus? (Jâ/Nç)");
		piedeva2 = keyboard.nextLine().charAt(0);
		if (gurki == 'Jâ' || gurki == 'JÂ') {
			gurki = 1;
			siers = siers + " un guríi";}
		
		piedeva3 = (peperroni) + (gurki);
		
		//Pasûtîjuma apmaksas aprçíinâðana
		
		kopa1 = (kopa2) + (piedeva3 * 1.25);
		System.out.println(Vards + ",ðeit bûs jûsu pasûtîjums:  ");
		System.out.println(cm + " cm pizza");
		System.out.println(piedeva + " + piedeva");
		System.out.println("Pasûtîjums maksâ: eiro" + df.format(cena));
		
		
		
		}
		}
		}
	
	
	
}