package RecursionBackTracking;

/*
 * 
 * 
ABC
ACB
BAC
BCA
CAB
CBA

 */

public class PermutationOfString {

	

	public static void main(String[] args) {
		char[] input = new char[]{'A','B','C'};
		char[] result = new char[input.length];
		int level = 0;
		int[] count = new int[]{1,1,1};
		
		wordRecursion(input,result,count,level);

	}

	private static void wordRecursion(char[] input,char[] result,int[] count,int level){
		if(input.length==level){
			for(int i =0;i<input.length;i++){
				System.out.print(result[i]);
			}
			System.out.println();
		}else{
			for(int i=0;i<input.length;i++){
				if(count[i]==0)
				{
					continue;
				}else{
					result[level]=input[i];
					count[i]--;
					wordRecursion(input,result,count,level+1);
					count[i]++;
				}
		}
		}
		
	}
}
