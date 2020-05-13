package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("**** Bem vindo ****");
		System.out.println("Entre com um número:");
		int x = sc.nextInt();
		sc.nextLine();
		String dia;
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
		case 7:
			dia = "sábado";
			break;
		default:
			dia = "Valor inválido!";
			break;
		}

		System.out.println("Dia da semana: " + dia);
		sc.close();

	}
}
