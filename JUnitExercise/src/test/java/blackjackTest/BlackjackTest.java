package blackjackTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.blackjack.Blackjack;
import com.qa.temperatureConverter.TemperatureConverter;

public class BlackjackTest {

	private Blackjack blackjack = new Blackjack();
	
	
	
	@Test
	public void blackjackTest() {
		assertEquals(21, blackjack.play(21,20));
		assertEquals(21, blackjack.play(20,21));
		assertEquals(0, blackjack.play(22,22));
		assertEquals(10, blackjack.play(22,10));
		assertEquals(10, blackjack.play(10,22));
	}
	
	

}
