//19.Write a java program to use methodoverriding

class Bank{
	double GetInterestRate()
	{
		return 0.0;
	}
}
class SBI extends Bank {
	double GetInterestRate()
	{
		return 6.9;
	}
	
}class HDFC extends Bank {
	double GetInterestRate()
	{
		return 7.9;
	}
	
}
public class Pro19{
 public static void main(String[] args){
	 System.out.println("---MethodOverriding---");
	Bank obj1=new SBI();
	 System.out.println("SBI Rate Of Interest Is:"+obj1.GetInterestRate()+"%");
	Bank obj2=new HDFC();	
	 System.out.println("HDFC Rate Of Interest Is:"+obj2.GetInterestRate()+"%");
	
 }
}
