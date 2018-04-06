import java.util.Scanner;

/*Main.java
*Created on 2018年3月25日
*/

public class Main {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.print("Please enter the number of processor:");
		int num=kb.nextInt();
		System.out.print("Please enter the max number of broken processors:");
		int f=kb.nextInt();
		System.out.print("Please enter the times of simulation:");
		int times=kb.nextInt();
		long average=0;
		for(int i=0;i<times;i++){
			Simulator simulator=new Simulator(num, f);
			simulator.start();
			average=average+simulator.getNumOfMessage();
		}
		System.out.println(average/times+" messages have been dilevered in average.");
	}

}