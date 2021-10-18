package kalkulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		while(true) {
			String naredba;
			naredba = s1.nextLine();
			if(naredba.equals("")) {
				continue;
			}
			
			if(naredba.equals("exit") || naredba.equals("kraj")) {
				break;
			}
			
			String[] lista = naredba.split(" ");
			if(lista.length != 3) {
				System.out.println("Ulaz nema 3 parametra.");
				continue;
			}
			int x = Integer.parseInt(lista[0]);
			int y = Integer.parseInt(lista[2]);
			if(lista[1].equals("+")) {
				System.out.println(x + y);
			}else {
				System.out.println("Unsupported operation.");
			}
			
		}
	}

}
