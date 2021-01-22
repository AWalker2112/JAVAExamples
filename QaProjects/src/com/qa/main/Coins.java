package com.qa.main;

public class Coins {

	public static void coinsExercise(double payment, double cost) {

		payment = payment * 100;
		cost = cost * 100;

		double change = payment - cost;

		System.out.println("You have paid with £" + (payment / 100) + ". The cost is £" + (cost / 100)
				+ ". Your total change is £" + (change / 100) + ".");

		double remainderTwenty = change - (change % 2000);

		if (remainderTwenty == 0 || remainderTwenty == change) {

		} else {

			System.out.println("You recieve x" + Math.round(((remainderTwenty / 2000))) + " £20 note(s)");

		}

		/////// TEN NOTES \\\\\\\

		double remainderTen = change % 2000;

		if (remainderTen < 1000) {

		} else {

			System.out.println("You recieve x" + 1 + " £10 note");

		}

		/////// FIVE NOTES \\\\\\\

		double remainderFive = change % 1000;

		if (remainderFive < 500) {

		} else {

			System.out.println("You recieve x" + 1 + " £5 note");

		}

		/////// FIFTY COINS \\\\\\\

		double remainderPound = change % 500;
		double remainderFifty = remainderPound % 100;
		// System.out.println(remainderPound);
		// System.out.println(remainderFifty);
		

		remainderPound = remainderPound - (remainderPound % 100);

		if (remainderPound == 0 || remainderPound == change) {

		} else {

			System.out.println("You recieve x" + (Math.round((remainderPound / 100))) + " £1 coin(s)");

		}

		if (remainderFifty > 49 && remainderFifty < 100) {
			System.out.println("You recieve x" + 1 + " 50p coin");
		} else {

		}

		/////// TWENTY COINS \\\\\\\

		double remainderTwentyCoin = remainderFifty % 50 - (remainderFifty % 50 % 20);

		if (remainderTwentyCoin == 0) {

		} else {
			System.out.println("You recieve x" + (Math.round((remainderTwentyCoin / 20))) + " 20p coin(s)");
		}

		/////// TEN COINS \\\\\\\

		double remainderTenCoin = (remainderFifty % 50 % 20) - (remainderFifty % 50 % 20 % 10);

		if (remainderTenCoin == 0) {

		} else {
			System.out.println("You recieve x" + 1 + " 10p coin");
		}

		/////// FIVE COINS \\\\\\\

		double remainderFiveCoin = (remainderFifty%10) - (remainderFifty%10%5);
		
		if (remainderFiveCoin == 0) {

		} else {
			System.out.println("You recieve x" + 1 + " 5p coin");

		}

		/////// TWO COINS \\\\\\\

		double remainderTwoCoin = ((remainderFifty % 10) % 5) - (((remainderFifty % 10) % 5) % 2);

		if (remainderTwoCoin == 0) {

		} else {
			System.out.println("You recieve x" + (Math.round(remainderTwoCoin / 2)) + " 2p coin");

		}

		/////// ONE COINS \\\\\\\

		double remainderOneCoin = remainderFifty % 10 % 5 % 2;

		if (remainderOneCoin == 0) {

		} else {
			System.out.println("You recieve x" + 1 + " 1p coin");

		}

	}

	

}
