package test.helloworld.pack;
import java.util.Scanner;

public class HelloWorld {
	static Scanner user_input = new Scanner( System.in );
	public static void main(String[] args) {
		System.out.println("Hello world!");
		System.out.println("What is your name?");
		String name = user_input.next();
		String mname = name + " is a nice name";
		System.out.println(mname);
		HiAgain hiAgain = new HiAgain();
		hiAgain.hiAgain();
	}
}