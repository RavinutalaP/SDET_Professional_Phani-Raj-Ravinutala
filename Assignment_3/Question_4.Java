package program3;

public class StringtoChar {
	public static void main(String args[])  
	{  
	//Char to string 
	char[] ch = {'B', 'R', 'O', 'A', 'D', 'R', 'I', 'D', 'G', 'E', ' ' , 'T', 'R', 'A', 'I', 'N', 'I', 'N', 'G'};  
	String string = new String(ch);  
	System.out.println(string);  
	
	//String to Char
	 String str = "BROADRIDGE TRAINING";
	 char[] cha = new char[str.length()];
     for (int i = 0; i < str.length(); i++) {
         cha[i] = str.charAt(i);
     }
     for (char c : cha) {
         System.out.println(c);
     }
	
	}  
}
