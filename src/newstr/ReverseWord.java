package newstr;

public class ReverseWord {
	public static void main(String[] args) {
		String str = "Techno",nstr="";
		char ch;
		System.out.print("Original word is : ");
		System.out.println("Techno");
		for(int i=0;i<str.length();i++) 
		{
			ch=str.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println("Reverse word is : " +nstr);
	}

}
