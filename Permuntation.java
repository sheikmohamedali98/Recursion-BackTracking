package RecursionBackTracking;

public class Permuntation {

	public static void main(String[] args) {

		String str = "ABC";
		System.out.println(str.length());
		permubtate(str,0,str.length()-1);
	}

	private static void permubtate(String str ,int start,int end){
		//System.out.println(start);
		if(start==end){
			//System.out.println("hai");
			System.out.println(str);
		}else{
			//System.out.println("else");
			for(int index=1;index<=end;index++){
				str = swap(str,start,end);
				permubtate(str,start+1,end);
				str = swap(str,start,index);
				
			}
		}
	}
	
	private static String swap(String str,int start,int end){
		char  temp;
		char[] ch = str.toCharArray();
		temp = ch[start];
		//System.out.println(temp);
		ch[start] = ch[end];
		//System.out.println(ch[start]);
		ch[end] = temp;
		String str1 = String.valueOf(ch);
		//System.out.println("swap"+str1);
		return String.valueOf(ch);
	}
	
}
