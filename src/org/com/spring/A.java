package org.com.spring;

public class A {
	B b;
	A(){
		System.out.println("A is created:");
		
	}
	
	public B getB() {
		return b;
		
	}
	
	public void setB(B b) {
		this.b=b;
	}
	
	void print() {
		System.out.println(" a is created:");
	}
	
	void display() {
		print();
		b.print();
	}

}
