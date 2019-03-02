package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The Class Anagram.
 */
public class Anagram {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Anagram a = new Anagram();
		System.out.println(a.anagram("3456", "3465"));
	}
	
	private static boolean mostRepeated( String s1, String s2 ) {
        LinkedList<String> list = new LinkedList<>( Arrays.asList( s1.split( "" ) ) );
        for ( String s : s2.split( "" ) ) {
            if ( list.contains( s ) ) {
                list.remove(s);
            }
            else {
                return false;
            }
        }
        return list.size() == 0;
    }

}
