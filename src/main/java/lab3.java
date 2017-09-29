
public class lab3 {


import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */



    public static String getUrlAsString(String url); {
    String url = urlToString("http://erdani.com/tdpl/hamlet.txt");
    System.out.println(url);
    System.out.println(countWords(url));
    }

    public static int countWords(String s) {
    int wordCount = 0;
    boolean word = false;
    int endOfLine = s.length() - 1;

    for (int i = 0; i < s.length()-1; i++) {
        if (Character.isLetter(s.charAt(i)) && i!=endOfLine) {
            word = true;
        }else if (!Character.isLetter(s.charAt(i)) && word) {
            wordCount++;
            word = false;
        }else if(Character.isLetter(s.charAt(i)) && i == endOfLine ) {
            wordCount++;
        }
    }
    return wordCount;
    }
