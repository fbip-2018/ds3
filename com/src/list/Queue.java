package com.src.list;

public class Queue {

	
	private Node<Object> head;
	private Node<Object> tail;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q = new Queue();
		q.push("A");
		q.push("B");
		q.print();
		System.out.println("========");
		System.out.println(q.remove().getData());
		q.push("C");
		System.out.println("========");
		System.out.println(q.peek().getData());
		System.out.println("========");
		q.print();
	}
	
	
	public void push(Object in){
		
		Node<Object> temp = new Node<Object>(in);
		if(tail != null){
			tail.next = temp;
		}
		else
			head = temp;
		tail = temp;
	}
	
	public Node<Object> remove(){
		
		Node<Object> out = head;
		head = head.next;
		return out;
	}
	
	public Node<Object> peek(){
		
		return head;
	}
	
	public void print(){
		
		Node<Object> temp = head;
		while(temp != null){
			System.out.println(temp.getData());
			temp = temp.next;
		}
	}
	
	private static class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T dat){
			data = dat;
		}
		
		public T getData(){
			return data;
		}
	}

}
