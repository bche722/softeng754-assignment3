import static org.junit.Assert.*;
import org.bson.Document;
import org.junit.Test;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DollarTest {
	@Test
	public void testDollarDivision() {
		Dollar ten = new Dollar(10);
		Dollar result = ten.dividedBy(2);
		assertEquals(new Dollar(5), result); //
	}

	@Test(expected = ArithmeticException.class)
	public void testDollarDividedByZero() {
		Dollar ten = new Dollar(10);
		ten.dividedBy(0);
	}

}