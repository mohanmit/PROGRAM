package Project;

public class PathFinding {
	
	    public static int flag = 0,prevRow=-1,prevCol=-1;
	    public static boolean isSafe(int[][] a,int r,int c){
	        System.out.println(r+" "+c);
	        if( r<0 || r>=5 || c<0 || c>=5 ||(r==prevRow && c==prevCol)){
	            return false;
	        }
	        if(a[r][c]!=1){
	            return false;
	        }
	        System.out.println("True "+r+" "+c);
	        return true;
	    }
	    public static void findPath(int[][] a, int r,int c){
	        int rowMove[]={1,0,-1,0};
	        int colMove[]={0,1,0,-1};
	        if(r==4 && c==4){
	            flag=1;
	            System.out.println("The result is ");
	            System.out.println(r+" "+c);
	            return;
	        }
	        for(int i=0;i<4;i++){
	            if(isSafe(a,r+rowMove[i],c+colMove[i])){
	                prevRow=r;
	                prevCol=c;
	                findPath(a,r+rowMove[i],c+colMove[i]);
	                if(flag==1){
	                    System.out.println(r+" "+c);
	                    return;
	                }
	            }
	        }
	    }
		public static void main(String[] args) {
		    int[][] a = {{1,0,1,1,1},
		                 {1,0,1,0,1},
		                 {1,1,1,0,1},
		                 {0,0,0,0,1},
		                 {0,0,0,0,1}};
		    for(int i=0;i<5;i++){
		        for(int j=0;j<5;j++){
		            System.out.print(a[i][j]+" ");
		        }
		         System.out.println(" ");
		    }
		    findPath(a,0,0);

		}
	}




