import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
  public static void main(String args[]) {

    Pattern p = Pattern.compile("[^0-9]+"); 
    Matcher m1 = p.matcher("55");
    Matcher m2 = p.matcher("1fdshfdgdfh");
    Matcher m3 = p.matcher("1");

    System.out.println(m1.find());
    System.out.println(m2.find());
    System.out.println(m3.find());

    
 
   
  }
}