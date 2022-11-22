package ineuron;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int vc=0,cc=0,sp=0;
		String s="Saiprasanna2626@gmail.com";
		System.out.println("The Given String is:"+s.toString());
		for(i=0;i<s.length();i++) 
		{
			if(s.charAt(i)=='A'||s.charAt(i)=='a'||s.charAt(i)=='E'||s.charAt(i)=='e'||s.charAt(i)=='I'||s.charAt(i)=='i'||s.charAt(i)=='O'||s.charAt(i)=='o'||s.charAt(i)=='U'||s.charAt(i)=='u')
			{
				vc++;
			}
			//32–47 / 58–64 / 91–96 / 123–126)
			else if(s.charAt(i)>=32&&s.charAt(i)<=47||s.charAt(i)>=58&&s.charAt(i)<=64||s.charAt(i)>=91&&s.charAt(i)<=96||s.charAt(i)>=123&&s.charAt(i)<=126)
			{
				sp++;
			}
			else
			{
				cc++;
			}
			
		}
		System.out.println("__________________________________________________________");
		System.out.println("Number of vowels in the above given string is:"+vc);
		System.out.println("__________________________________________________________");
		System.out.println("Number of consonants in the above given string is:"+cc);
		System.out.println("__________________________________________________________");
		System.out.println("Number of special characters in the above given string is:"+sp);
		
	}
}