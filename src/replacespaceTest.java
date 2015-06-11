import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class replacespaceTest {
	replacespace rp;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		rp=new replacespace();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetstringspacenum() {
		int i=rp.getstringspacenum("sss sss sss sd fdf");
		System.out.println(i);
	}

}
