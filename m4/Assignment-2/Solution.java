import java.util.*;
public class Solution {
	/* Fill the main function to print resultant of addition of matrices*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		//System.out.println("input number of rows");
		a = scan.nextInt();
		//System.out.println("input number of coloums");
		b = scan.nextInt();

		int arr1[][]= new int[a][b];
		int arr2[][] = new int[a][b];
		int sum[][] = new int[a][b];


		int c,d;
		//System.out.println("input elements in first matrix");
		for (c = 0 ; c < a ; c=c+1){
			for (d=0;d < b ; d=d+1)
				arr1[c][d] = scan.nextInt();
		}
	

	int a1 = scan.nextInt();
		//System.out.println("input number of coloums");
		int b1 = scan.nextInt();
		//System.out.println("input elements in second matrix");
		for (c=0;c<a; c=c+1){
			for (d=0;d<b;d=d+1)
				arr2[c][d] = scan.nextInt();
		}
			

		
		
		for (c =0 ; c< a ;c=c+1){
			for (d=0 ; d< b ; d=d+1)
				sum[c][d] = arr1[c][d]+arr2[c][d];
		}


		for (c=0; c < a; c = c+1){
			for (d = 0 ; d < b ; d=d+1)
				System.out.print(sum[c][d]+" ");
			System.out.println("");
		}
		
		
	}
}