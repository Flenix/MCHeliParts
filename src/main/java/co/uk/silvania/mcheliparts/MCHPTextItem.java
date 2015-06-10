package co.uk.silvania.mcheliparts;

public class MCHPTextItem extends MCHPItems {
	
	public static String cal = "";
	public static String stack = "";

	public MCHPTextItem(String cal, int stack) {
		super(64);
		this.cal = cal;
		if (stack > 1) {
			this.stack = stack + "x";
		}
	}

}
