package br.com.filipe.relogio;

import java.util.Scanner;

import br.com.filipe.relogio.service.RelogioService;

public class Relogio {

	static Scanner input = new Scanner(System.in);

	static boolean error = false;

	static int inputHora;

	static int inputMinuto;

	public static void main(String[] args) {

		TakeHour();

		TakeMinutes();

		if (!error) {

			RelogioService calculateAngle = new RelogioService();

			int angle = calculateAngle.retornaAnguloRelogio(inputHora, inputMinuto);

			System.out.format("Reported Time : %s : %d \n", inputHora, inputMinuto);

			System.out.format("The angle formed by the %d hour hand and the %d minute hand is: %s°", inputHora,
					inputMinuto, angle);

		}

	}

	private static void TakeMinutes() {

		try {
			System.out.println("Please enter the minutes value between 0 and 59 : ");

			inputMinuto = input.nextInt();
		} catch (Exception e) {
			error = true;

			System.out.format("you entered a value that is incompatible with the minutes!");

			System.out.format("restart and try again!");
		}

		if (inputMinuto > 59 || inputMinuto < 0) {
			System.out.format("only enter numbers between 0 and 59!");

			TakeMinutes();
		}

	}

	private static void TakeHour() {
		try {
			System.out.println("Please enter the hour value between 0 and 23 : ");

			inputHora = input.nextInt();
		} catch (Exception e) {
			error = true;

			System.out.format("you entered a value that is incompatible with the hours!");
		}

		if (inputHora > 23 || inputHora < 0) {
			TakeHour();
		}
	}

}
