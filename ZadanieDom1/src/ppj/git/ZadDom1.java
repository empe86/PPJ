package ppj.git;

import java.util.Scanner;

public class ZadDom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double wynagrodzenie;
		int lGodzin;
		double stawka;
		Scanner	in = new Scanner(System.in);
		System.out.println("Podaj liczbê przepracowanych godzin:");
	lGodzin=Integer.parseInt(in.next());
	System.out.println("Podaj stawkê godzinow¹ pracownika:");
	stawka=Double.parseDouble(in.next());
	in.close();
	if(stawka<12) {
		System.out.println("Stawka jest za niska");
	}else if(lGodzin<40) {
		System.out.println("Za ma³a liczba godzin");
	}else if(lGodzin>60) {
		System.out.println("Za du¿a liczba godzin");
	}else {
		wynagrodzenie=((lGodzin-40)*1.5*stawka)+(40*stawka);
		System.out.println("Wynagrodzenie pracownika wynosi: "+wynagrodzenie+" PLN");
	}
	
	}

}
