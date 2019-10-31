package Main;

public class Solution {
	//双循环
	public boolean Find(int target, int [][]array) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[0].length; j++) {
				if(target == array[i][j]) {
					return true;
				}	
			}
		}
		return false;
	}
	//从左下角进行查找
	public boolean Find1(int target, int [][]array) {
		int rows = array.length;
		int cols = array[0].length;
		if((rows | cols) == 0)
			return false;
		int row = rows - 1;
		int col = 0;
		while(row>=0&col<cols){
			if(array[row][col]>target) {
				row--;
			}else if(array[row][col]<target) {
				col++;
			}else {
				return true;
			}
		}
		return false;
	}
	//从右上角查找
	public boolean Find2(int target, int[][]array) {
		int rows = array.length;
		int cols = array[0].length;
		if((rows | cols) == 0) {
			return false;
		}
		int row = 0;
		int col = cols - 1;
		while(row<rows&col>=0) {
			if(array[row][col] > target) {
				col--;
			}else if(array[row][col]<target){
				row++;
			}else {
				return true;
			}
		}
		return false;
	}
	public static void main(String []args) {
		int [][]array = new int[4][5];
		int n = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[0].length; j++) {
				n = n + 1;
				array[i][j] = n;
			}
		}
		
		Solution s = new Solution();
		System.out.print(s.Find2(13, array));
	}

}
