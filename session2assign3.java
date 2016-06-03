package acadgild.assignments;

public class session2assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[][] = new int[5][5];

		 int i,j,k=1;
		 
		 for(i=0;i<5;i++){
			 k=1;
			 for(j=0;j<=i;j++){
				 
				 
				 array[i][j]=k;
				 k++; 
			 
			
			 }
			 			 
		 }
		 for(i=0;i<5;i++){
			 for(j=0;j<=i;j++){
				 System.out.print(array[i][j]+" ");
			 
			 }
			 System.out.println();
		 }
		 
		 
		 for(i=0;i<5;i++){
			 	k=1;
			 for(j=3;j>=i;j--){
				 array[i][j]=k;
				 k++;
				 
			 }
		 }
		
		 for(i=0;i<5;i++){
			 for(j=3;j>=i;j--){
			 
				 System.out.print(array[i][j]+" ");
				 
			 }
			 System.out.println();
		 }
		 
		 
	}
}



