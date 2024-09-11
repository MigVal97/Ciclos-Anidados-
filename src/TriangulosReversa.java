public class TriangulosReversa {
		
		public static void TrianguloRev(int n){
			int a,e,s;
			
			for(a=n;a>=1;a--) {
				for(e=1;e<=n-a;e++) {
					System.out.print("");
				}
			
			for(s=1;s<=2*a-1;s++) {
				System.out.print('*');
			}
			
			System.out.println("");
			
			
			
			}
			
			
		}
	
		public static void main(String[] args) {
		TrianguloRev(6);
		}
	}




