public class MyR {
	
	private int i = 0, v = 0, x = 0, posV = 0, posX = 0, rez;
	private int posI [] = new int [3];
	private boolean r = false;
	
	boolean getBool () {
		return r;
	}
	
	boolean myR (String str) {
		i = 0;
		v = 0; 
		x = 0;
		for (int j = 0; j < str.length(); j ++) {
			if ( (str.charAt(j) == 'i') || (str.charAt(j) == 'I') ) {
				i ++;
			}
			if ( (str.charAt(j) == 'v') || (str.charAt(j) == 'V') ) {
				v ++;
			}
			if ( (str.charAt(j) == 'x') || (str.charAt(j) == 'X') ) {
				x ++;
			}
		}
		return ((i + v + x) != 0 );
	}
	
	float setData(String str) {
		rez = 0;
		r = false;
		i = 0;
		v = 0; 
		x = 0;
		for (int j = 0; j < str.length(); j ++) {
			if ( (str.charAt(j) == 'i') || (str.charAt(j) == 'I') ) {
				posI[i] = j;
				i ++;
			}
			if ( (str.charAt(j) == 'v') || (str.charAt(j) == 'V') ) {
				v ++;
				posV = j;
			}
			if ( (str.charAt(j) == 'x') || (str.charAt(j) == 'X') ) {
				x ++;
				posX = j;
			}
		}
		if ( (i < 4) && (v < 2) && (x < 2) && ((i + v + x) < 5)	) {
			for (int j = 0; j < str.length(); j ++) {
				if ( (str.charAt(j) == 'i') || (str.charAt(j) == 'I') ) {
					rez = rez + 1;
				}
				if ( (str.charAt(j) == 'v') || (str.charAt(j) == 'V') ) {
					rez = rez + 5;
				}
				if ( (str.charAt(j) == 'x') || (str.charAt(j) == 'X') ) {
					rez = rez + 10;
				}
				if ( (i == 1) && ((posI[0] < posV) || (posI[0] < posX)) ) {
					rez = rez - 1;
				} else {
					if ( (i > 1) && ((posI[0] > posV) || (posI[0] > posX)) 
							|| ((i < 4) && ((posI[0] > posV) || (posI[0] > posX)) ) )
					{
						r = false;
					} else {
						r = true;
					}
					
				}
			}
		}
		return rez;
	}
	
	String convertRez (float f) {
		StringBuilder sb = new StringBuilder();
		sb.delete(0, sb.length());
		float myF = f;
		for (int i = 0; myF != 0; i++) {
			if ( (myF/100) >= 1.0) {
				sb.append("C");
				myF = myF - 100;
			} else if ( ((myF + 10) / 100) >= 1.0) {
				sb.append("XC");
				myF = myF - 90;
			} else if ( (myF/50) >= 1.0) {
				sb.append("L");
				myF = myF - 50;
			} else if ( ((myF + 10) / 50) >= 1.0) {
				sb.append("XL");
				myF = myF - 40;
			} else if ( (myF/10) >= 1.0) {
				sb.append("X");
				myF = myF - 10;
			} else if ( ((myF + 1) / 10) >= 1.0) {
				sb.append("IX");
				myF = myF - 9;
			} else if ( (myF/5) >= 1.0) {
				sb.append("V");
				myF = myF - 5;
			} else if ( ((myF + 1) / 5) >= 1.0) {
				sb.append("IV");
				myF = myF - 4;
			} else if ( (myF/1) >= 1.0) {
				sb.append("I");
				myF = myF - 1;
			}	
		}
		return sb.toString();
	}
}