package glava03;

public class zad10 {
	public static void main(String[] args) {
		int num = 2334;
		
		String numInString = Integer.toString(num);
		
		int sum = 0;
		
		for (char nums : numInString.toCharArray()) {
			sum += nums - '0';
		}
		
		System.out.println("The sum is: " + sum);
		
		StringBuilder res = new StringBuilder();

	        
	    res.append(numInString);

	    res.reverse();
	    
		System.out.println("Reversed string: " + res);
		
		char firstChar = numInString.charAt(0);
		
        char lastChar = numInString.charAt(numInString.length() - 1);

        
        numInString = numInString.substring(1) + firstChar;
        
        System.out.println(numInString);
        
        numInString = Integer.toString(num);
        
        numInString = lastChar + numInString.substring(0, 3);
        
        System.out.println(numInString);
        
        numInString = Integer.toString(num);
        
        char secondChar = numInString.charAt(1);
        char thirdChar = numInString.charAt(2);
        
        numInString = firstChar + numInString.substring(1);
		
        System.out.println(numInString);
	}
}
