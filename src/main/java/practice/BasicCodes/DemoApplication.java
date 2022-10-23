package practice.BasicCodes;


public class DemoApplication {


	public static void main(String[] args) {

		//Prime Or Not
		/*int num = 16;
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			// condition for nonprime number
			//Here, note that we are looping from 2 to num/2. It is because a number is not divisible by more than its half.
			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");*/


// Palindrome or not code with String
/*	String str = "nitin";
	int len = str.length();
	String revStr ="";
	//Reverse String logic
	for(int i=len-1;i>=0;i--){
		revStr = revStr + str.charAt(i);
		}
		System.out.println(revStr);
	if(str.equals(revStr)){
		System.out.println("pali");
	}else{
		System.out.println("not");
	}*/


		//Palindrome or not with string array
/*		String a[] = {"n", "i", "t", "i", "n"};
		if (a.length == 0) { //empty array is a palindrome
			System.out.println("pali");
		}
		int len = a.length;
		for (int i = 0; i < len; i++)
		{
			String first = a[i];
			String second = a[len - i - 1];

			if (!first.equals(second)){
				System.out.println("not");
				break;
			}
			else {
				System.out.println("pali");
				break;
			}
		}*/

//Palindrome or not with int array
/*		int a[] = {3,6,6,4};
		if (a.length == 0) { //empty array is a palindrome
			System.out.println("pali");
		}
		int len = a.length;
		for (int i = 0; i < len; i++)
		{
			int first = a[i];
			int second = a[len - i - 1];

			if (first!=second){
				System.out.println("not");
				break;
			}
			else {
				System.out.println("pali");
				break;
			}
		}*/

		//second-largest element in integer array

/*		int temp, a[] = {5,7,2,4,9,1};
		int len = a.length;
		System.out.println(len);
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
		System.out.println("largest num is " + a[len-1]);
		System.out.println("Second largest num is " + a[len-2]);*/


	//second-largest element in String array

/*	String temp, a[] = {"5","7","2","4","9","1"};
	int len = a.length;
		System.out.println(len);
		for(int i=0;i<len;i++){
		for(int j=i+1;j<len;j++){
			if(Integer.parseInt(a[i]) > Integer.parseInt(a[j])){
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		System.out.println(a[i]);
	}
		System.out.println("largest num is " + a[len-1]);
		System.out.println("Second largest num is " + a[len-2]);*/

		//Number character in String
		String str = "vaibhav";
		int len = str.length();
		char ch[]=new char[str.length()];
		for(int i=0;i<len;i++){
			int find = 0;
			for(int j=0;j<=i;j++){
				if(str.charAt(i)== str.charAt(j)){
					find++;
				}
			}
			if(find==1){
				System.out.println("Number of occu"+str.charAt(i)+"is:"+str.charAt(i));
			}
		}




}

}
	


