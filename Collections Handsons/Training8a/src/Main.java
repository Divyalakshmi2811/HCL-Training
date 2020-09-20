import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		String b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username 1");
		String a=sc.nextLine();
		list.add(a);
		do
		{
			System.out.println("Do you want to continue?(y/n)");
			 b=sc.nextLine();
			if(b.equals("y"))
			{
				System.out.println("Enter the username 2:");
				String c=sc.nextLine();
				list.add(c);
			}
			else
				break;
		}
		while(b.equals("y"));
		{
			System.out.println("The Names entered are:");
			
		}
		for(String d:list)
		{
			System.out.println(d);
		}
		
	}

}
