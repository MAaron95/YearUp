import java.util.Scanner;
public class PayRoll {
	
	static Scanner sc = new Scanner(System.in);
	
	private String m_employeeName = null;
	private double m_salary = -1;
	private double m_taxPercentage = .30;
	private double m_benefits = 150;
	
	PayRoll(String name, double salary, double taxes, double benefits)
	{
		setEmployeeName(name);
		setSalary(salary);
		setTaxPercentage(taxes);
		setBenefits(benefits);	
	}
	
	private void setBenefits(double benefits) 
	{
		m_benefits = benefits;
	}
	public double getBenefits()
	{
		return m_benefits;
	}
	private void setTaxPercentage(double taxes) 
	{
		m_taxPercentage = taxes;
	}
	public double getTaxPercentage()
	{
		return m_taxPercentage;
	}
	
	
	private void setSalary(double salary) 
	{
		m_salary = salary;
	}
	public double getSalary()
	{
		return m_salary;
	}
	
	
	private void setEmployeeName(String name) 
	{
		m_employeeName = name;
	}
	
	public String getEmployeeName(String name)
	{
		return m_employeeName;
	}
}


