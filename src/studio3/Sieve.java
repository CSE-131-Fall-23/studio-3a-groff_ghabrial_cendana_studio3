package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers do you wanna check if they are prime.");
		int n = in.nextInt();
		int[] numbers = new int[n];
		
		for (int i = 0; i<n; i++) {
			numbers[i]=i+1;
		}
		for (int z = 1; z<n; z++) {
			for (int j = 0; j<n; j++) {
				if (((numbers[j]%numbers[z])==0)&&(numbers[j]!=numbers[z])&&(numbers[z]!=-1))
				{
					numbers[j] = -1;
				}
			}
		}
		int[] prime = new int[n];
		for (int k = 0; k < n; k++) {
			if (numbers[k]!= -1) {
				prime[k]=numbers[k];
			}
		}
		for (int i = 1; i<n; i++) {
			if (prime[i]!=0) {
			System.out.println(prime[i]);
			}
		}
		
		
	}
}
