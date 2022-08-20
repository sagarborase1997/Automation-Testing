package repeat;

public class pattern1 {

	public static void main(String[] args) {
		for(int i=0;i<=6;i++)
		{
			int alphabet=65;
			int temp=i;
			for(int j=0;j<=i;j--)
			{
				System.out.print((char)(alphabet+temp)+" ");
				temp=temp+5;
				//temp++;
			}
			System.out.println();
		}

	}

}
