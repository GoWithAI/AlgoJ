package test;

import aj.Intq;
import algo.pojo.Person;
import algo.pojo.Personq;

public class Queues {
	public static void main(String[] args) {

		Intq intq=new Intq(4);
		intq.enqueue(3);
		intq.enqueue(4);
		intq.enqueue(6);
		intq.enqueue(7);
		intq.showAll();
		
		System.out.println("**********************");
		Personq personq=new Personq();
		personq.enqueue(new Person("Deepak", "12"));
		personq.enqueue(new Person("Patil", "22"));
		
		personq.showAll();
		
		
	}
}
