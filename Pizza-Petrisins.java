import java.text.DecimalFormat;
public class Pizza-Petrisins {
	public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat
	Scanner scan = new Scanner(System.in);
	
	//Main�gie
	DecimalFormat df = new DecimalFormat("#.##");
	Scanner keyboard = new Scanner(System.in);
	String vards; //Pirmais pas�t�t�ja v�rds
	char picasveids; 
	String picasnosaukums; //Veida nosaukums
	int cm; //Picas izm�rs
	double picascena = 0.0; //picas apmaksa
	double VPN = 0.08;
	double summa; //apmaksa kop� ar piedev�m
	double cena; //Picas cenas(kop�j�)
	double kopa1;
	double kopa2;
	int peperroni = 0; //Pirm� piedeva (Pepperoni)
	int gurki = 0; //Otr� piedeva (Gur�i)
	int piedeva3; //Kop� piedevas
	String siers = "Siers"; //Autom�tisk� piedeva
	System.out.println("Ievadiet savu V�rdu un Uzv�rdu: );"
	vards = keyboard.nextLine();
	
	//Pieg�de
	double distance = 0;
	double piegade  = 0;
	System.out.println("Ievadiet savu att�lumu no m�su picas veikala(0,ja atrodaties m�su �k�):  ");
	distance = keyboard.nextDouble();
	if (distance == 0) {
		piegade = 0;
		System.out.println("Jums nav j�apmaks� pieg�de.");
		else if(distance > 1) {
			piegade = ((distance * 0.5)+2);
			System.out.println("Jums par pieg�di j�samaks�: �"+ df.format(piegade));}
		else if(distance > 0) {
			piegade = 2.00;
			System.out.println("Jums par pieg�di j�samaks�: �"+ df.format(piegade));}
		}
	
	
	
	//Picas cenas
	System.out.println("K�da izm�ra picu j�s v�l�tos?(1| 20(cm); 2| 30 (cm); 3| 40 (cm); 4| 50 (cm): );"
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
		System.out.println("Cipars kuru j�s ievad�j�t ir neder�gs,autom�tiski izv�l�ts 20 (cm).");
		picascena = 20;}
		keyboard.nextLine();
		
		// Picas veids
		System.out.println("K�du picu j�s v�laties?: 1)Pizza Margherita (PM); 2)Pizza Marinara (PMA); 3)Margharita extra (MEX) :  ");
		if (picasveids == 'PM' || picasveids == 'pm' ) {
			picasnosaukums = "Pizza Margharita";}
		else if (picasveids == 'PMA' || picas veids == 'pma') {
			picasnosaukums = "Pizza Marinara";}
		else if (picasveids == 'MEX' || picas veids == 'mex' ) {
			picasnosaukums = "Margharita extra";}
		
		//Picas piedevas
		System.out.println("Vis�m pic�m n�k kl�t siers.");
		System.out.println("Katra n�ko�� piedeva maks� 3.00 eiro, izv�laties: Pepperoni vai Gur�i.");
		
		//Pepperoni
		System.out.println("Vai j�s v�laties Pepperoni? (J�/N�)");
		peperroni = keyboard.nextLine().charAt(0);
		if (peperroni == 'J�' || peperroni == 'J�') {
			piedeva1 = 1;
			siers = siers + " un Pepperoni";}
		else {
			piedeva1 = 0;
		}
		
		//Gur�i
		System.out.println("Vai j�s v�laties Gur�us? (J�/N�)");
		piedeva2 = keyboard.nextLine().charAt(0);
		if (gurki == 'J�' || gurki == 'J�') {
			gurki = 1;
			siers = siers + " un gur�i";}
		
		piedeva3 = (peperroni) + (gurki);
		
		//Pas�t�juma apmaksas apr��in��ana
		
		kopa1 = (kopa2) + (piedeva3 * 1.25);
		System.out.println(Vards + ",�eit b�s j�su pas�t�jums:  ");
		System.out.println(cm + " cm pizza");
		System.out.println(piedeva + " + piedeva");
		System.out.println("Pas�t�jums maks�: eiro" + df.format(cena));
		
		
		
		}
		}
		}
	
	
	
}