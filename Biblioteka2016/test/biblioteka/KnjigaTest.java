package biblioteka;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KnjigaTest {

	private Knjiga k;
	@Before
	public void setUp() throws Exception {
		k=new Knjiga();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNaslov() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNaslov() {
		String naslov = "Starac i more";
		k.setNaslov(naslov);
		assertEquals(k.getNaslov(), naslov);
	}

	@Test
	public void testGetIsbn() {
		fail("Not yet implemented");
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIsbnNegativan() {
		k.setIsbn(-1);
	}

	@Test
	public void testGetIzdavac() {
		String izdavac = "Vulkan";
		k.setIzdavac(izdavac);
		assertEquals(k.getIzdavac(), izdavac);
	}

	@Test
	public void testSetIzdavac() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetIzdanje() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetIzdanje() {
		fail("Not yet implemented");
	}

}
