public class Util {
	public static void println(String s) {
		System.out.println(s);
	}
		public static void print(String s) {
		System.out.print(s);
	}
	public static void init(String[] arr) {
		//init all elements of array to ""
		for(String string : arr) {
			string = "";
		}
	}
	public static void println(String[] arr) {
		//print all elements in array
		for (String string : arr) {
			if (string != null) {
			    println(string);
			}
		}
	}
	public static void print(String[] arr) {
		//print all elements in array
		String result = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != null) {
			    result = result.concat("," + arr[i]);
			}
		}
		if (arr[0] == null) {
			println("");
		} else {
		    println(result);
	    }
	}
	public static String list(String[] arr) {
		//list all elements in array
		String result = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != null) {
			    result = result.concat("," + arr[i]);
			}
		}
		if (arr[0] == null) {
			return "";
		}
		return result;
	}
}