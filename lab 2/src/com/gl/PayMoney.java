package com.gl;
import java.util.Scanner;
public class PayMoney {
	int transactionArray[];
	int sizeOfArray;
	
	
		public static void main(String[] args) {
				
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		int sizeOfArray = s.nextInt();
		
		int transactionArray[] = new int[sizeOfArray];
		System.out.println("enter the values of array");
		
		for (int i = 0; i < sizeOfArray; i++) {
			transactionArray[i] = s.nextInt();
		}
		System.out.println("enter the total no of targets that needs to be achieved");
		int totalNoOfTargets = s.nextInt();
		
		while (totalNoOfTargets--!= 0) {
			int flag = 0;
			int valueOfTarget;
			System.out.println("enter the total no of targets that needs to be achieved");
			valueOfTarget = s.nextInt();
			
			long sum = 0;
			for (int i = 0; i < sizeOfArray; i++) {
			sum += transactionArray[i];
			if (sum >= valueOfTarget) {
			System.out.println("Target achieved after "+(i + 1) + "transactions ");
			flag = 1;
			break;
}
}
if (flag == 0) {
System.out.println(" Given target is not achieved ");
}

}
	
}
}