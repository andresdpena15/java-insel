package ausnahmen;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FindAllEmailAddresses {
	public static void main (String[] args ) {
		printAllEmailAddresses ( "https://gist.github.com/cjaoude/fd9910626629b53c4d25");
		
	}
	
	static void printAllEmailAddresses (String urlString ) {
		try {
			URL url = new URL( urlString ); 
			Scanner scanner = new Scanner( url.openStream() ); 
			Pattern pattern = Pattern.compile( "[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}" ); 
			
			for ( String email; (email = scanner.findWithinHorizon( pattern, 0 )) != null; ) 
				System.out.println(email); 
		}
		
		catch ( MalformedURLException e ) {
			System.err.println( "URL ist falsch aufgebaut! " ); 
		}
		
		catch ( IOException e ) {
			System.err.println( "URL konnte nicht geöffnet werden! "); 
		}
	}
}
