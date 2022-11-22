package ineuron;

public class StringDuplicate {

	public static void main(String[] args) {
		int i = 0, count =0;
		String s1 ="Welcome to iNeuron";
		String s2=s1.toLowerCase();
		char s[]=s2.toCharArray();
		System.out.println("The Given String is:" + s2);

		System.out.println("The Duplicates are:");
		for(i=0;i<s2.length();i++)
		{
			count=1;
			for(int j=i+1;j<s2.length();j++)
			{
				if(s[i]==s[j]&&s[i]!=' ')
				{
					
					count++;
					s[j]='0';
				}
			}
			if(count>1&&s[i]!='0')
			{
			   System.out.println(s[i]);
			}
		}
		
		

	}

}