import static org.junit.Assert.*;

import org.junit.Test;

public class SpreadsheetTest {
	Spreadsheet sheet = new Spreadsheet();
	
	@Test
	public void test() {

		Spreadsheet cell1 = new Spreadsheet();
		Spreadsheet cell2 = new Spreadsheet();
		
		
		assertEquals("String: ", "0", cell1.get());
		
		cell1.set("38");
		cell2.set("2");

		assertEquals("String: ", "38", cell1.get());
		
		String add = cell1.addition(cell1.get(), cell2.get());
		assertEquals("String: ", "40", add);
	}
	@Test
	public void test1() {
		Spreadsheet cell1 = new Spreadsheet();
		Spreadsheet cell2 = new Spreadsheet();
		
		
		assertEquals("String: ", "0", cell1.get());
		
		cell1.set("38");
		cell2.set("2");
		
		String sub = cell1.subtraction(cell1.get(), cell2.get());
		assertEquals("String: ", "36", sub);
		
	}
	@Test
	public void test2() {
		Spreadsheet cell1 = new Spreadsheet();
		Spreadsheet cell2 = new Spreadsheet();
	
	
		assertEquals("String: ", "0", cell1.get());
	
		cell1.set("38");
		cell2.set("2");
		String mult = cell1.multiplication(cell1.get(), cell2.get());
		assertEquals("String: ", "76", mult);
	}
	
	@Test
	public void test3() {
		Spreadsheet cell1 = new Spreadsheet();
		Spreadsheet cell2 = new Spreadsheet();
	
	
		assertEquals("String: ", "0", cell1.get());
	
		cell1.set("38");
		cell2.set("1");
		String div = cell1.divison(cell1.get(), cell2.get());
		assertEquals("String: ", "38", div);
	}
	
	
	
}
	