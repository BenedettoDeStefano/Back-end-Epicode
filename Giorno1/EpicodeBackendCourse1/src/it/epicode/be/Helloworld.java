package it.epicode.be;

import java.util.Arrays;
import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
	    //*********************************ESERCIZIO1*********************************
		System.out.println("This is my first Epicode Java Project!");
		
		//*********************************ESERCIZIO2*********************************
		int num1 = 10;
        int num2 = 20;
        int risultatoMoltiplicazione = moltiplicazione(num1, num2);
        System.out.println("Risultato della moltiplicazione: " + risultatoMoltiplicazione);
        
        //*********************************ESERCIZIO3*********************************
        String stringa = "ciao ";
        int num = 5;
        String stringaConcatenata = concatena(stringa, num);
        System.out.println("Stringa concatenata: " + stringaConcatenata);
        
        //*********************************ESERCIZIO4*********************************
    	String arrayString[] = {"abcd", "efgh", "ilmn", "opqr", "stuv"};
    	String stringaInserita = "z";
    	
        System.out.println(inserisci(arrayString, stringaInserita));
        
        //*********************************ESERCIZIO5*********************************
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa:");
        String stringa1 = scanner.nextLine();

        System.out.println("Inserisci la seconda stringa:");
        String stringa2 = scanner.nextLine();

        System.out.println("Inserisci la terza stringa:");
        String stringa3 = scanner.nextLine();

        System.out.println(stringa1 + " " + stringa2 + " " + stringa3);
        System.out.println(stringa3 + " " + stringa2 + " " + stringa1);
        
       //*********************************ESERCIZIO6*********************************
        double base = 5.0;
        double altezza = 3.0;
        double perimetro = perimetroRettangolo(base, altezza);
        System.out.println("Perimetro del rettangolo: " + perimetro);
        
       //*********************************ESERCIZIO7*********************************
        int numero = 7;
        pariDispari(numero);
        
       //*********************************ESERCIZIO8*********************************
        double lato1 = 3.0;
        double lato2 = 4.0;
        double lato3 = 5.0;
        double perimetroTriangolo = perimetroTriangolo(lato1, lato2, lato3);
        System.out.println("Perimetro del triangolo: " + perimetroTriangolo);
		}
		






//*********************************ESERCIZIO2*********************************
	
	public static int moltiplicazione(int num1, int num2) {
		return num1 * num2;
	}

	
	
	
	
	
	
	
	
	
//*********************************ESERCIZIO3*********************************
	
	public static String concatena (String stringa, int num) {
		return stringa + num;
	}

	
	
	
	
	
	
	
	
	
	
//*********************************ESERCIZIO4*********************************
	public static String inserisci (String[] array, String stringa1) {
		String newArray[] = new String [6];
		
		newArray[0] = array[0];
		newArray[1] = array[1];
		newArray[2] = array[2];
		newArray[3] = stringa1;
		newArray[4] = array[3];
		newArray[5] = array[4];
		
		return Arrays.toString(newArray);
	}
	
	
	
	
	
	
	
	
	
//*********************************ESERCIZIO5*********************************
	
public static String stringUtente(String stringa1, String stringa2, String stringa3) {
	return stringa1 + stringa2 + stringa3;
}







//*********************************ESERCIZIO6*********************************
public static double perimetroRettangolo ( double lato1, double lato2) {
	return lato1 * 2 + lato2 * 2;
}








//*********************************ESERCIZIO7*********************************

public static void pariDispari(int num1) {
	if (num1 % 2 == 0) {
		System.out.println("0");
	} else {
		System.out.println("1");
	}
}




public static double perimetroTriangolo ( double lato1, double lato2, double lato3) {
	return lato1 + lato2 + lato3;
}


}


