public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static boolean validIndex(int[] arr1, int index) {
		int length = arr1.length;
		try {
            arr1[index] = 11451419;

			if (arr1[index] == 11451419) {
				return true;
			}

        }catch (ArrayIndexOutOfBoundsException e){
			return false;
		}
		return false;
	}
	public static int divide(int a, int b) {
		int result = 0;
		try {
			result = a / b;
			return result;
		} catch (ArithmeticException e) {
			return 0;
		}
	}
	public static int saveConvertStringtoInt(String input) {
		int result = 0;
		try{
			result = Integer.parseInt(input);
			return result;
		} catch (NumberFormatException e){
			return 0;
		}
	}
	

}
