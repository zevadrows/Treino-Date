package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		int matric;
		Date dataIng;
		Date ferias;

		char answer = 's';

		while (answer == 's') {
			
			System.out.print("Matrícula: ");
			matric = sc.nextInt();
			System.out.print("Data de ingresso (dd/mm/yyy): ");
			String date = sc.next();
			dataIng = sdf.parse(date);

			Calendar cal = Calendar.getInstance();
			cal.setTime(dataIng);

			if (cal.get(Calendar.MONTH)< 3) {
				cal.set(Calendar.YEAR, 2019);
				cal.set(Calendar.DAY_OF_MONTH, 02);
				cal.set(Calendar.MONTH, 0);
				ferias = cal.getTime();
				System.out.println("Comissionado de matrícula nº" + matric + "\n" + "Férias programadas para "
						+ sdf.format(ferias));
				System.out.print("Deseja verificar outro comissionado (s/n)? ");
				answer = sc.next().charAt(0);
			} else {
				cal.set(Calendar.YEAR, 2020);
				cal.set(Calendar.DAY_OF_MONTH, 02);
				cal.set(Calendar.MONTH, 0);
				ferias = cal.getTime();
				System.out.println("Comissionado de matrícula nº" + matric + "\n" + "Férias programadas para "
						+ sdf.format(ferias));
				System.out.print("Deseja verificar outro comissionado (s/n)? ");
				answer = sc.next().charAt(0);
			}
		}

		sc.close();

	}

}
