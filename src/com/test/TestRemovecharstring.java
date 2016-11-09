package com.test;



	import static org.testng.Assert.assertEquals;

	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import com.apple.string.RemoveCharacterInOneLine;

	public class TestRemovecharstring {
		
		
		RemoveCharacterInOneLine removeCharacterInOneLine;
		
		@BeforeClass
		public void beforeClass(){
			removeCharacterInOneLine= new RemoveCharacterInOneLine();
		}
		
		
		@Test
		public void testRemoveChar(){
			assertEquals("HelloJava",removeCharacterInOneLine.removEcharInALine("HelloWorld", "World", "Java") );
		}
		@Test
		public void testRemoveChar1(){
			assertEquals("HelloJava",removeCharacterInOneLine.removEcharInALine("", "World", "Java") );
		}

		@Test
		public void testRemoveChar2(){
			assertEquals("HelloJava",removeCharacterInOneLine.removEcharInALine("76485498", "World", "Java") );
		}

		

	}


