package pattern;

public class Patterns {

	public static void main(String[] args) {
		
		int n=1;
		
		for(int i=1; i<=5; i++){
			int spaces = (5-i);
			
			for(int j=1; j<= spaces; j++){
				
			System.out.print(" ");
			
			}
			for(int j=1; j<= i-1; j++){
				
			System.out.print("*");
			
			}
			for(int j=1; j<= i; j++){
				
			System.out.print("*");
			
			}
			System.out.println();
			}
		
}
}