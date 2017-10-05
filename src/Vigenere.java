/**
 * cerner_2^5_2017
 * 
 * Vigenere cipher:  See http://bit.ly/2y0xHd5
 *  
 * The program will run with a test data set, or via command-line arguments:
 * 
 * java Vigenere "text to process in quotes" "pass phrase in all upper or lower case" [encrypt | decrypt]
 * 
 * @author RM049974
 */
public class Vigenere {
	private static final Object[][] TEST_DATA = new Object[][] {{"THIS IS AN UPPERCASE TEST", "RYAN", true}, {"KFIF ZQ AA LNPRIAAFV REFK", "RYAN", false}, {"this is a lowercase test", "ryan", true}, {"kfif zq a yfueetysr kcsg", "ryan", false}, {"space in the password test", "ryan password", true},{"jnapt if lds gdjqwbgd lwoh", "ryan password", false}, {"Syntax: Vignere \"text to encrypt or decrypt\" password encrypt|decrypt", "secret", true}};
	public static String v(String __, String _$, boolean $_){
		StringBuffer ___ = new StringBuffer(__.length());
		for(char i=(char)(-1), temp[]=_$.toCharArray(); i < temp.length || i == 0177777; i++) _$ = i == 0177777 ? "" : (_$ + (Character.isLetter(temp[i]) ? temp[i]: ""));
		int $ = 0;
		for (char $$$=0, _____=__.charAt($$$); $$$ < __.length(); $$$++,_____=__.charAt($$$ < __.length()?$$$:$$$-1)) 
		for (int $$=0; $$ < 1; $$++, $ = (Character.isLetter(Character.codePointAt(new char[]{_____}, 0))) ? ($ + 0b1) % _$.length() : $ ) ___.append((Character.isLetter(Character.codePointAt(new char[]{_____}, 0))) ? (Character.isLetter(Character.codePointAt(new char[]{_____}, 0)) ? (char)((((int)_____ - 0101 - (!Character.isUpperCase(_____) ? 040 : 0b0)+(($_ ? 0 : 26) + ($_?1:-1)*((int)_$.charAt($) - 0101 - (!Character.isUpperCase(_$.charAt($)) ? 040 : 0b0)) ))%26) + (Character.isUpperCase(_____) ? 0101 : 0141)):_____):(_____));
		return ___.toString();
	}
	public static void main(String[] args) 
	{
		for (Object[] testData: (args.length == 3 ? new Object[][]{{args[0],args[1],args[2].equalsIgnoreCase("encrypt")}}:Vigenere.TEST_DATA)) System.out.println("\"" +((String)testData[0])+(((Boolean)testData[2]).booleanValue()?"\" encrypted ":"\" decrypted ")+"is \""+Vigenere.v((String)testData[0],(String)testData[1],((Boolean)testData[2]).booleanValue())+"\""); 
	}
}
