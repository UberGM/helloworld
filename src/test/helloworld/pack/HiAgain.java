package test.helloworld.pack;
import java.util.Scanner;

public class HiAgain {
	static Scanner user_input = new Scanner( System.in );
	public void hiAgain() {
		System.out.println("Hi again");
		System.out.println("Can I have your last name too?");
		String lname = user_input.next();
		String fname = lname + " Is a nice last name";
		System.out.println(fname);
	}
}