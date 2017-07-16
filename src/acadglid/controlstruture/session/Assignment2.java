/*
 * Write a program to print the following pattern:
 * a
 a b a
a b c b a
 a b c
   a
 */

package acadglid.controlstruture.session;

public class Assignment2 {
	
	public static void main (String[] args) {
		
		int rowIncrement = 1 ;
		
		int spaceToInsert = 2;
		
		
		
		
		//Start of the outer loop to print the number of columns
		
		for(int i=0;i<5;i++) { 
			
			
			//start of the inner loop to insert the spaces before print of rows 
			 
			for(int k=0 ; k< spaceToInsert; k++ ) {
				
				System.out.print(" ");
			}
			
			
					
			//Start of the inner loop to print the rows in the number of columns
			int charToPrint = 96 ;
			for(int j=0;j<rowIncrement;j++) {
				
				if(j<=i) {
					
					charToPrint = charToPrint + 1;
				}
				
				else {
					
					charToPrint = charToPrint  - 1 ;
					
				}
				
				System.out.print((char)charToPrint);
				System.out.print(" ");
				
										
			}
			
			//Change of the column 
			
			System.out.println();
			
			
			
						
			//in order to print odd number of value in row , increment of j should be till 1 ,3 5, and the decrement 3, 1
			
			if ( i > 1 ) {
				
				rowIncrement = rowIncrement -2;
				spaceToInsert = spaceToInsert + 1;
							
				}
			else {
				
				rowIncrement = rowIncrement + 2;
				spaceToInsert = spaceToInsert -1;
				
				
			}
			
					
			
		}
	}

}
