public class Ex18 {
	public static void main(Strng args[])
	{
		
		        Scanner sc = new Scanner(System.in);
		int[] num=new int[10];
		
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter a number: ");
			num[i]= sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(num[i]);
			
		}
		Arrays.sort(num);

        System.out.println("\nMinimum 3 Numbers:");
		
         system.out.println("First :"+num[0]);
         system.out.println("Second :"+num[1]);
         system.out.println("Third :"+num[2]);
            
		System.out.println("\Maximum 3 Numbers:");
		
         system.out.println("First :"+num[7]);
         system.out.println("Second :"+num[8]);
         system.out.println("Third :"+num[9])
	}
}