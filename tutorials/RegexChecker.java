import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * A demo of Java regular expressions.
 * @author shorser
 */
public class RegexChecker {

  private static Pattern pattern;
  private static Matcher matcher;

  public static void main(String[] args){

    /**
     * You can use this static method to compare one string to one regex.
     */
    System.out.println(Pattern.matches("a.*b","abcbcdeb"));

    /** 
     * If you have one regex that you want to compare to substrings 
     * of one or more Strings, you can use this.
     */
    pattern = Pattern.compile("(123)\\1{2}"); //This is the regex.
    matcher = pattern.matcher("123123123123123123"); //This is the string.
    List<String> alphaNumSequence = new ArrayList<String>();
    while(matcher.find()) {
    	System.out.println(matcher.group());
    	alphaNumSequence.add(matcher.group());
    }
    //String[] experiment = "abacdabaccacdabddaba".split("aba");
    //System.out.println(experiment[2]);

    /**
     * One string can be compared to many regular expressions using
     * this String method.
     */
    String str = new String();
    str = "Hello_World";
    boolean isSame = str.matches("Hello\\w.*");
    System.out.println(isSame);
   }
}
