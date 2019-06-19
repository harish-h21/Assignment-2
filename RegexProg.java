import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexProg
{
	public static void main(String... args)
	{
		List<String> numbers=new ArrayList<String>();
		String str="vijay +917676980909	kumar +1123456 hari +91-7877866455 hy 8787878787 +9187676789 kk +9966556655t6 00918877887788 0918877887788 0091-8877887788 091-9988998899";
		Pattern pattern=Pattern.compile("([+][0-9]{2,}[-]{0,1}[0-9]{6,})|([0-9]{3,}[-]{0,1}[0-9]{6,})|([+][0-9]{6,})");
		//Pattern pattern=Pattern.compile("\\d");
		Matcher match=pattern.matcher(str);
		
			while(match.find())
			{
				numbers.add(match.group());		
			}
		Pattern pattern2=Pattern.compile("(^[+]91[-]{0,1}[789]\\d{9}$)|([0]{0,2}91[-]{0,1}[789]\\d{9}$)|(^[789][0-9]{9})");
		for(String number:numbers)
		{
			Matcher matcher2=pattern2.matcher(number);
			if(matcher2.find())
			{
				System.out.println(number +" is Indian Number");
			}	
			else
			{
				System.out.println(number +" is not Indian Number");	
			}	
		}
			
	}
}