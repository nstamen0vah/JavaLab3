import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import uk.ac.glasgow.jagora.Stock;
import uk.ac.glasgow.jagora.impl.DefaultStock;


public class StockTest {
	private Stock stock;
	
	@After
	public void tearDown(){
		stock = null;
	}
	
	@Before
	public void setUp(){
		stock = new DefaultStock("lemons");
	}

	@Test
	public void testName() {
		assertEquals("Expecting   lemons .", " lemons ", stock . getName ());
	}

}
