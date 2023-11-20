package DAY_1;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("enter the size");
		
		int l= s.nextInt();
		int [] a= new int [l];
		System.out.println("enter the elements");
		for(int i=0; i<l;i++) {
		 a[i]=s.nextInt();
		}
		System.out.println("the elements are");
		for(int j=0; j<l; j++) {
			System.out.println(a[j]);
		}
		int[][] weeklyLotteryNumbers = {
                {1, 2, 3, 4, 5},
                {10, 20, 30, 40, 50},
                {13, 24, 35, 46, 57},
                {10, 23, 35, 48, 58}
        };
		

        for (int i = 0; i < weeklyLotteryNumbers.length; i++) {
            for (int j = 0; j < weeklyLotteryNumbers[i].length; j++) {
              
                System.out.print(weeklyLotteryNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
		
		
	}


