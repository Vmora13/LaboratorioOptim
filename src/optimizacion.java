import java.util.Arrays;
/**
 *  
 * @author VivianaM
 *
 */
public class optimizacion {

	
	
	
	
	public static void main(String[] args) {
	
		//int[] a= {1,6,0,7,-3,8,0,-2,11};
		int[] a= {0,11,36,10,0,17,-23,81,0,0,12,11,0};
		int[] b= new int[a.length];
		
		int n=0,nf=a.length-1;
		for(int i=0;i<a.length;i++) {
			
			if(n<=nf){
				if(a[i]!=0) {
					b[n]=a[i];
					n++;
				}
				else
				{
					b[nf]=0;
					nf--;
				
				}
			} else break;
				
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		

	}

}
