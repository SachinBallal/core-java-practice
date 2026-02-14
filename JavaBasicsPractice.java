public class JavaBasicsPractice {
	
		
	 public static void main(String[] args) {
		// TODO Auto-generated method s
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				if(i==j) {
					System.out.print("$");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				if(i==j) {
					System.out.print("$");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			
	}}
