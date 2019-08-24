package test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.java.practice.Recursionexample;
import com.jenkov.totorials.networking.DummyClass;

public class DummyClassTestApi {

	@Test
	public void testMatchesApi() {
		DummyClass obj = new DummyClass();

		String statement = "Hello World...";
		String word = "Stone";
		String response = obj.matches(statement, word);
		Assert.assertEquals("NOTHING", response);
	}

	@Test
	public void testMatchesApi2() {
		DummyClass obj = new DummyClass();

		String statement = "Hello World...Welcome to Stone Manor";
		String word = "World";
		String response = obj.matches(statement, word);
		Assert.assertEquals("Menakshi Prasad World", response);
	}
	
	@Test
	public void testfact() {
		DummyClass obj = new DummyClass();
	int r=obj.factor(5);
		Assert.assertEquals(120, r);
		
	}
}
 