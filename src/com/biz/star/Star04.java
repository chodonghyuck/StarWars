package com.biz.star;

public class Star04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.out.println("--- 빈 칸찍고 정삼각형별찍기");
				for(int j= 0; j < 5; j++) {  
					//빈 칸을 몇개 찍고
					for(int i = j; i < 5; i++) {
						System.out.print(" ");
					}
					 // 남은 부분에 별을 찍어라.
					 for(int k = 0; k < j; k++) {
					 
						System.out.print("* ");
				    }	
					 System.out.println();

				}
				for(int j= 0; j < 5; j++) {
					//빈 칸을 몇개 찍고
					for(int i = 0; i < j; i++) {
						System.out.print(" ");
					}
					 // 남은 부분에 별을 찍어라.
					 for(int k = j; k < 5; k++) {
					 
						System.out.print("* ");
				    }
					System.out.println();	
				}

	}

}
