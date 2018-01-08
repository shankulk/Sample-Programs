package com.shankulk.ds;

public class Stack {
	int[] stack = new int[10];
	int tos = -1;

	public static void main(String[] args) throws Exception {
		Stack s = new Stack();
		
		s.push(0);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(8);
		s.push(9);
		//s.push(10);
	
		System.out.println(s.stack);
		
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		//System.out.println(s.pop());

	}
	
	public void push(int num) throws Exception {
		if(tos < stack.length - 1) {
			stack[++tos] = num;
		} else {
			throw new Exception("Stack is full");
		}
	}
	
	public int pop() throws Exception {
		if(tos > -1) {
			return stack[tos--];
		} else {
			throw new Exception("Stack is empty");
		}
	}

}
