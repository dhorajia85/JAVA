
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a [] = {1,2,3,4,5};
		int i;
		for (i =0; i<5; i++)
		{
		System.out.println(a[i]);
		}
		
		*/
		//Multi Dimension
		
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int j,k;
		for (j=0;j<3;j++ ) {
			for (k=0;k<3;k++) {
				System.out.print(b[j][k] + "  ");
			}
			System.out.println();
		}
		
		
	}

}
