
public class TaxAuditor 
{
	public void Audit(TaxPayer taxPayer)
	{
		System.out.println("Tax auditor is now auditing " + taxPayer.getClass());
	}
}
