package Main;
import java.util.Stack;
public class Solution {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	public void push(int node) {
		stack2.push(node);
	}
	
	public int pop() {
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
	public static void main(String []args) {
		Solution s = new Solution();
		for(int i = 0; i < 5; i++) {
			s.push(i);
		}
		System.out.print(s.pop());
		System.out.print(s.stack1.isEmpty());
	}

}
