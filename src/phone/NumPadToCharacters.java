package phone;

import java.util.HashMap;

public class NumPadToCharacters {
	
/*
------- ------- -------
|     | | ABC | | DEF |
|  1  | |  2  | |  3  |
------- ------- -------
------- ------- -------
| GHI | | JKL | | MNO |
|  4  | |  5  | |  6  |
------- ------- -------
------- ------- -------
|PQRS | | TUV | | WXYZ|
|  7  | |  8  | |  9  |
------- ------- -------
------- ------- -------
|     | |space| |     |
|  *  | |  0  | |  #  |
------- ------- -------
*/
	
	public static void main(String[] args) {
		System.out.println(numToChar("441216614166610161444155512166")); // HANGO MILAN
	}
	
	
	public static String numToChar(String str) {

		String[] label = str.split("1");
		String out = "";

		HashMap<Character, String> mobileNumPad = new HashMap<Character, String>();

		mobileNumPad.put('2', "ABC");
		mobileNumPad.put('3', "DEF");
		mobileNumPad.put('4', "GHI");
		mobileNumPad.put('5', "JKL");
		mobileNumPad.put('6', "MNO");
		mobileNumPad.put('7', "PQRS");
		mobileNumPad.put('8', "TUV");
		mobileNumPad.put('9', "WXYZ");
		mobileNumPad.put('0', " ");

		for (int i = 0; i < label.length; i++) {
			char pattern = label[i].charAt(0);
			String getWords = mobileNumPad.get(pattern);
			int length = label[i].length();

			if (length > getWords.length()) {
				length = length % getWords.length();
			}
			if (length == 0) {
				length = getWords.length();
			}
			out = out + getWords.charAt(length - 1);
		}
		return out;
	}
}