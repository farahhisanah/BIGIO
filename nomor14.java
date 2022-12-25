public class nomor14{

public static void main(String[] args){
	int i,j,n=5;
		for(i=1;i<=n-1;i++){
		System.out.println();
		
		for(j=1;j<=i;j++)
		System.out.print(j);
		for(j=1;j<=2*(n-i);j++)
		System.out.print(" ");
		for(j=1;j<=i;j++)
		System.out.print(j);
		}
		
		for(i=0;i<=n;i++){
		System.out.println();
		
		for(j=1;j<=n-i;j++)
		System.out.print(j);
		for(j=0;j<2*i;j++)
		System.out.print(" ");
		for(j=n-i;j>0;j--)
		System.out.print(j);
	
		}
	}

}