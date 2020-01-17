package Project;

public class WaterTrapping {
	
		


		static int flag=0,sum=0;
		//function to calculate water  level
		public static int calcWater(int[] a,int start, int end) {
			int sum1,t1;
			if(a[start]<a[end]) {
				t1=start;
			}
			else {
				t1=end;
			}
			//to fill all block with same amount of water
			sum1 = a[t1]*(end-start-1);
			for(int i=start+1;i<end;i++) {
				sum1-=a[i];
			}
			if(sum1<0) {
				return 0;
			}
			return sum1;
		}
		public static void findTankLevel(int[] a) {
			int start=0,end= a.length-1;
			// loop to compare water level
			for(int i=1;i<a.length&&flag!=1;i++) {
				
				if(i==end) {
					sum += calcWater(a,start,i);
					flag=1;
				}
				if(a[start]<a[i]) {
					sum += calcWater(a,start,i);
					start = i;
				}
				if(a[start]>a[i] && a[i]>a[end]) {
					sum += calcWater(a,start, i);
					start =i;
				}
				
			}
			
		}
		public static void main(String[] args) {
			int[] a = {7,0,4,8,5,0,6,4,0,6};
			findTankLevel(a);
			
			System.out.println(sum);
		}

	}




