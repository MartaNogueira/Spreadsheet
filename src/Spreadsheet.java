public class Spreadsheet {

	public Spreadsheet() {

	}

	String cellVar = "0";

	public String get() {
		// to be implemented
		return cellVar;

	}

	public void set(String value) {
		// to be implemented
		cellVar = value;

	}

	public void evaluate(String cell) {
		// to be implemented

	}

	public String addition(String value1, String value2) {

		int par1 = Integer.parseInt(value1);
		int par2 = Integer.parseInt(value2);

		int var = par1 + par2;

		String result = String.valueOf(var);
		return result;

	}
	public String subtraction(String value1, String value2) {

		int par1 = Integer.parseInt(value1);
		int par2 = Integer.parseInt(value2);

		int var = par1 - par2;

		String result = String.valueOf(var);
		return result;

	}
	public String multiplication(String value1, String value2) {
		
		int par1 = Integer.parseInt(value1);
		int par2 = Integer.parseInt(value2);
		
		int var = par1 * par2;
		
		String result = String.valueOf(var);
		return result;
		
	}
	public String divison (String value1, String value2) {
		if (value2.equals("0")){
			return  "#Error";
		}
		
		int par1 = Integer.parseInt(value1);
		int par2 = Integer.parseInt(value2);
		
		int var = par1 / par2;
		
		String result = String.valueOf(var);
		return result;
}
	public String module (String value){
		
		value = value.startsWith("-") ? value.substring(1) : value;
		
		return value;
	}
	
}
