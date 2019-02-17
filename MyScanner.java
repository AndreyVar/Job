public class MyScanner {
	
	MyR myR = new MyR();
	
	StringBuilder sb = new StringBuilder();

	private String myStr;
	private int sum = 0, div1 = 0, div2 = 0, sub = 0, mult = 0;
	private float a, b;
	private String strA, strB;
	private Object rez = 0;
	
	public void setData (String str) {
		myStr = str;
	}
	
	Object myScanerMethod () {
		div1 = 0;
		div2 = 0;
		mult = 0;
		sum = 0;
		sub = 0;
		sb.delete(0, sb.length());
		for(int i = 0; i < myStr.length(); i++){
			 if(myStr.charAt(i) != ' ') {
				sb.append(myStr.charAt(i));
			 }
		}
		
		for (int i = 0; i < sb.length(); i ++) {
			 if (sb.charAt(i) == '/') {
				 div1 ++;
			 }
			 if (sb.charAt(i) == ':') {
				 div2 ++;
			 }
			 if (sb.charAt(i) == '*') {
				 mult ++;
			 }
			 if (sb.charAt(i) == '+') {
				 sum ++;
			 }
			 if (sb.charAt(i) == '-') {
				 sub ++;
			 }
		}
		
		if((div1 + div2 + mult + sum + sub) > 1) {
			return null;
		}
		
				 if (div1 != 0) {
					 strA = sb.substring(0, sb.indexOf("/"));
					 strB = sb.substring((sb.indexOf("/") + 1), sb.length());
					 if ( (myR.myR(strA)) && (myR.myR(strB)) ) {
						 try {
							 a = myR.setData(strA);
							 b = myR.setData(strB);
							 rez = myR.convertRez(div (a, b));
						 } catch (Exception e) {
							 return null;
						 }
					 } else if (!( (myR.myR(strA)) || (myR.myR(strB)) )) {
						 try {
							 if ( (Integer.parseInt(strA) < 0) || 
									 (Integer.parseInt(strB) < 0) ) {
								 return null;
							 } else {
								 rez = div (Integer.parseInt(strA), Integer.parseInt(strB));
							 }
						 } catch (Exception e) {
							 return null;
						 }
					 } else {
						 if (!( (myR.myR(strA)) && (myR.myR(strB)) )) {
							 return null;
						 }
					 }
				 } else
				 if (div2 != 0) {
					 strA = sb.substring(0, sb.indexOf(":"));
					 strB = sb.substring((sb.indexOf(":") + 1), sb.length());
					 if ( (myR.myR(strA)) && (myR.myR(strB)) ) {
						 try {
							 a = myR.setData(strA);
							 b = myR.setData(strB);
							 rez = myR.convertRez(div (a, b));
						 } catch (Exception e) {
							 return null;
						 }
					 } else if (!( (myR.myR(strA)) || (myR.myR(strB)) )) {
						 try {
							 if ( (Integer.parseInt(strA) < 0) || 
									 (Integer.parseInt(strB) < 0) ) {
								 return null;
							 } else {
								 rez = div (Integer.parseInt(strA), Integer.parseInt(strB));
							 }
						 } catch (Exception e) {
							 return null;
						 }
					 } else {
						 if (!( (myR.myR(strA)) && (myR.myR(strB)) )) {
							 return null;
						 }
					 }
				 } else
				 if (sum != 0) {
					 strA = sb.substring(0, sb.indexOf("+"));
					 strB = sb.substring((sb.indexOf("+") + 1), sb.length());
					 if ( (myR.myR(strA)) && (myR.myR(strB)) ) {
						 try {
							 a = myR.setData(strA);
							 b = myR.setData(strB);
							 rez = myR.convertRez(sum (a, b));
						 } catch (Exception e) {
							 return null;
						 }
					 } else if (!( (myR.myR(strA)) || (myR.myR(strB)) )) {
						 try {
							 if ( (Integer.parseInt(strA) < 0) || 
									 (Integer.parseInt(strB) < 0) ) {
								 return null;
							 } else {
								 rez = sum (Integer.parseInt(strA), Integer.parseInt(strB));
							 }
						 } catch (Exception e) {
							 return null;
						 }
					 } else {
						 if (!( (myR.myR(strA)) && (myR.myR(strB)) )) {
							 return null;
						 }
					 }
				 } else
				 if (sub != 0) {
					 strA = sb.substring(0, sb.indexOf("-"));
					 strB = sb.substring((sb.indexOf("-") + 1), sb.length());
					 if ( (myR.myR(strA)) && (myR.myR(strB)) ) {
						 try {
							 a = myR.setData(strA);
							 b = myR.setData(strB);
							 rez = myR.convertRez(sub (a, b));
						 } catch (Exception e) {
							 return null;
						 }
					 } else if (!( (myR.myR(strA)) || (myR.myR(strB)) )) {
						 try {
							 if ( (Integer.parseInt(strA) < 0) || 
									 (Integer.parseInt(strB) < 0) ) {
								 return null;
							 } else {
								 rez = sub (Integer.parseInt(strA), Integer.parseInt(strB));
							 }
						 } catch (Exception e) {
							 return null;
						 }
					 } else {
						 if (!( (myR.myR(strA)) && (myR.myR(strB)) )) {
							 return null;
						 }
					 }
				 } else
				 if (mult != 0) {
					 strA = sb.substring(0, sb.indexOf("*"));
					 strB = sb.substring((sb.indexOf("*") + 1), sb.length());
					 if ( (myR.myR(strA)) && (myR.myR(strB)) ) {
						 try {
							 a = myR.setData(strA);
							 b = myR.setData(strB);
							 rez = myR.convertRez(mult (a, b));
						 } catch (Exception e) {
							 return null;
						 }
					 } else if (!( (myR.myR(strA)) || (myR.myR(strB)) )) {
						 try {
							 if ( (Integer.parseInt(strA) < 0) || 
									 (Integer.parseInt(strB) < 0) ) {
								 return null;
							 } else {
								 rez = mult (Integer.parseInt(strA), Integer.parseInt(strB));
							 }
						 } catch (Exception e) {
							 return null;
						 }
					 } else {
						 if (!( (myR.myR(strA)) && (myR.myR(strB)) )) {
							 return null;
						 }
					 }
				 }
		return rez;
	}
	
	private int sum (int a, int b) {
		return a + b;
	}
	
	private float sum (float a, float b) {
		return a + b;
	}
	
	private float div (int a, int b) {
		return a / b;
	}
	
	private float div (float a, float b) {
		return a / b;
	}
	
	private int sub (int a, int b) {
		return a - b;
	}
	
	private float sub (float a, float b) {
		return a - b;
	}
	
	private int mult (int a, int b) {
		return a * b;
	}
	
	private float mult (float a, float b) {
		return a * b;
	}
}