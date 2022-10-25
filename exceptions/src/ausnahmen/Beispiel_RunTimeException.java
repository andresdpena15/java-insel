package ausnahmen;

public class Beispiel_RunTimeException {
	
	/*
	 * Runtime Exceptions werden nicht vom Compiler behandelt, 
	 * sondern direkt zur Laufzeit vom JVM
	 * 
	 * Bekannte Exceptions: 
	 * 
	 * ArithmeticException: Division durch 0
	 * ArrayIndexOutOfBoundsException
	 * ClassCastException -> Typumwandlung ist nicht möglich.
	 * EmptyStackException -> Stapelspeicher ist leer.
	 * IllegalArgumentException -> falsche Argumente melden.
	 * IllegalMonitorStateException -> Monitor nicht verfügbar.
	 * NullPointerException
	 * UnsupportedOperationException -> Nicht valide Operation ausgeführt.
	 * 
	 * Best practice: Ausnahmen dieser Art nach oben steigen lassen und 
	 * eventuell behandeln.
	 * 
	 * RunTimeExceptions werden in JavaDoc dokumentiert.
	 */
	
	public static int getVatRate() {
		
		String stringToConvert = "19%"; 
		double vat = 19;
		try {
			vat = Integer.parseInt(stringToConvert); 
		}
		
		catch ( NumberFormatException e ) {
			System.err.printf( "'%s' kann man nicht in eine Zahl konvertieren!%n", 
					stringToConvert ); 
		}
		
		System.out.printf("Weiter geht's mit MwSt = %g%n", vat); 
		return 0; 
	}
	
	public static void main( String[] args ) {
		System.out.println( getVatRate() );
	}

}
