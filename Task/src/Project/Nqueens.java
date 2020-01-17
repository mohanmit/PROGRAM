package Project;

public class Nqueens {
	
	    static int flag=0;
	    // function to check queens present or not
	    public static boolean isSafe(int[][] a,int r,int c){
	    	// loop to check in rows
	        for(int i=0;i<c;i++){
	            if(a[r][i]==1){
	                return false;
	            }
	        }
	        // to check upper incline
	        
	        for(int i=r,j=c;i>=0&& j>=0;i--,j--){
	            if(a[i][j]==1){
	                return false;
	            }
	        }
	        // to check lower incline
	        for(int i=r,j=c;i<8&& j>=0;i++,j--){
	            if(a[i][j]==1){
	                return false;
	            }
	        }
	        //System.out.println("true"+r+" "+c);
	        return true;
	    }
	    public static void placeQueen(int[][] a,int row,int col,int count){
	        if(count==8 ){
	            System.out.println("The final output");
	            // to print the final output
	            for(int i=0;i<8;i++){
			    for(int j=0;j<8;j++){
			        System.out.print(a[i][j]+" ");
			    }
			    System.out.println("");
			  }
			  flag = 1;
			  return;
			
	        }
	        for(int i=0;i<8;i++){
	            if(isSafe(a,i,col)){
	                // System.out.println(count);
	                a[i][col]=1;
	                count++;
	                placeQueen(a,row,col+1,count);
	                if(flag==1){
	                    return;
	                }
	                a[i][col]=0;
	                count--;
	            }
	        }
	    }
	    public static void main(String[] args) {
	    	// to print the matrix
			int[][] a= new int[8][8];
			for(int i=0;i<8;i++){
			    for(int j=0;j<8;j++){
			        a[i][j]=0;
			    }
			}
			//a[0][0]=1;
//	 		System.out.println(isSafe(a,0,1));
//	 		System.out.println(isSafe(a,3,3));
//	 		System.out.println(isSafe(a,1,1));
			placeQueen(a,0,0,0);
		}
	}




