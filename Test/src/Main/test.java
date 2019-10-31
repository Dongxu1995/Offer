package Main;

public class test {
	public int judge(int n) {
		int result = 0;
		int left = n;
		int right = n;
		while(true) {
			
			if(left == cube(left)) {
				result = left;
				break;
			}
			if(right==cube(right)) {
				result = right;
				break;
			}
			left = left - 1;
			right = right + 1;
		}
		return result;
	}
	
	public int cube(int n) {
		int result = 0;
		int tmp = n;
		while(tmp > 0) {
			result = result + (int)Math.pow(tmp%10, 3);
			tmp = tmp/10;
			System.out.println(result);
		}
//		System.out.println(result);
		return result;
	}

    public static void main(String[] args) {
    	
    	
    }

}
