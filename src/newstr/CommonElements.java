package newstr;

public class CommonElements {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] arr1 = {2,4,6,8,10,12,14,16};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1.length;j++) { 
				if(arr[i] == (arr1[j])) {
					System.out.println("Common element is : " +(arr[i]));
				}
			}
		}
	}

}
