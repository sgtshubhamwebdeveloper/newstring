package newstr;

public class Arrwithoutzeronumber {
	public static void main(String[] args) {
		int[] arr = {50,77,12,54,-11};
		System.out.println("Original array : " +arr);
		System.out.println("Result :" +arr);
	}
		public static boolean test(int[] nums) {
			for(int num : nums) {
				if(num==0 || num ==-1) {
					return false;
				} 
		}
			return true;
	}

}
