
public class Main {

	public static void main(String[] args) 
	{
		Banker dimon = new Banker(1000000);
		dimon.PayTaxes(.35);
		
		Scientist nye = new Scientist(120000);
		nye.PayTaxes(.20);
		
		dimon.FileTaxReturn();
		nye.FileTaxReturn();
		
		TaxAuditor craig = new TaxAuditor();
		craig.Audit(dimon);
		craig.Audit(nye);
	}

}
