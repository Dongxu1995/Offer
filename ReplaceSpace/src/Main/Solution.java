package Main;

public class Solution {
	public String ReplaceSpace(StringBuffer str) {
		StringBuffer output = new StringBuffer();
		int len = str.length();
		for(int i=0; i<len; i++) {
			if(str.charAt(i)==' ') {
				output.append("%20");
				continue;
			}
			output.append(str.charAt(i));
		}
		return output.toString();
	}
	public static void main(String []args) {
		Solution s = new Solution();
		StringBuffer strb  = new StringBuffer();
		strb.append("we are happy");
		String output = s.ReplaceSpace(strb);
		System.out.println(output);
	}
}
