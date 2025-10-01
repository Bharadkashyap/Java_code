//14.Writeajavaprogramtousemultilevelinheritance.

class GrandFather{
	void GrandFatherName()
	{
		System.out.println("GrandFather is Vijay");
	}
}
class Father extends GrandFather {
	void FatherName()
	{
		System.out.println("Father is Anil ");
	}
	
}
class Son extends Father {
	void SonName()
	{
		System.out.println("Son is Manoj");
	}
	
}
public class Pro14{
 public static void main(String[] args){
	 System.out.println("---MultiLevel inheritance---");
	Son obj=new Son();
	obj.GrandFatherName();
	obj.FatherName();
	obj.SonName();
 }
}
