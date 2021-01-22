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

			System.out.println("You recieve x" + (remainderTwenty / 2000) + " £20 note(s)");

		}

		double remainderTen = change % 1000;

		if (remainderTen == 0 || remainderTen == change) {

		} else {

			System.out.println("You recieve x" + 1 + " £10 note");

		}

		double remainderFive = change % 500;

		if (remainderFive == 0 || remainderFive == change) {

		} else {

			System.out.println("You recieve x" + 1 + " £5 note");

		}

		double remainderPound = change % 500;
		double remainderFifty = remainderPound % 100;
		//System.out.println(remainderPound);
		//System.out.println(remainderFifty);
		double changeCoins = remainderPound;

		remainderPound = remainderPound - (remainderPound % 100);

		if (remainderPound == 0 || remainderPound == change) {

		} else {

			System.out.println("You recieve x" + (remainderPound / 100) + " £1 coin(s)");

		}

		if (remainderFifty > 49 && remainderFifty < 100) {
			System.out.println("You recieve x" + 1 + " 50p coin");
		} else {

		}

		double remainderTwentyCoin = remainderFifty - (remainderFifty % 20);

		if (remainderTwentyCoin == 0) {

		} else {
			System.out.println("You recieve x" + (remainderTwentyCoin / 40) + " 20p coin(s)");
		}

		double remainderTenCoin = (remainderFifty % 20) - ((remainderFifty % 20) % 10);

		if (remainderTenCoin == 0) {

		} else {
			System.out.println("You recieve x" + 1 + " 10p coin");
		}

		double remainderFiveCoin = ((remainderFifty % 20) - ((remainderFifty % 20) % 5)) % 5;

		if (remainderFiveCoin == 0) {

		} else {
			System.out.println("You recieve x" + 1 + " 5p coin");
			

		}
		
		
		double remainderTwoCoin = ((remainderFifty % 10)%5) - (((remainderFifty % 10)%5)%2);
		
		if (remainderTwoCoin == 0) {

		} else {
			System.out.println("You recieve x" + remainderTwoCoin + " 2p coin");
			

		}
		

		double remainderOneCoin = (((remainderFifty % 10)%5) - (((remainderFifty % 10)%5)%2) -  ((remainderFifty % 10)%5)%2) ;
		
		if (remainderOneCoin == 0) {

		} else {
			System.out.println("You recieve x" + 1 + " 1p coin");
			

		}
		
		
		

	}

	public static void coinsExercise2(double num1, double num2) {

		System.out.println(num1 % num2);
	}

}
