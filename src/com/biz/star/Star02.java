package com.biz.star;

public class Star02 {

	public static void main(String[] args) {
		// TODO main이 시작되는 곳  // JAVA DOC에 의한 주석속의 keyword  // 북마크역할을 하는 주석
		
				// TODO 사각형 숫자찍기
				for(int j = 0; j <5; j ++) {
					for(int i = 0; i < 5 ; i++) {
						System.out.print(i + " ");
					}
					System.out.println();
				}
				System.out.println("=============================");
				
				// TODO 역삼각형 숫자찍기
				for(int j = 0; j <5; j ++) {
					for(int i = j; i < 5 ; i++) {
						System.out.print(i + " ");
					}
					System.out.println();
				}
				System.out.println("==============================");
				
				// TODO 단일 for를 사용한 예
				for(int j =0; j < 5; j++) {
					for(int i = j; i < 5; i++) {
						System.out.print("* ");
					}
						System.out.println();
				}
				System.out.println("==============================");
				
				// TODO 역삼각형 별찍기
				for(int j= 0; j< 5 ; j++) {
					for(int i = j; i < 5 ;i++) {
						System.out.print("* ");
					}
					System.out.println();
				}
		        System.out.println("==============================");
				
		        // TODO 삼각형 별찍기
				for(int j= 0; j< 5 ; j++) {
					for(int i = 0; i < j ;i++) {
						System.out.print("* ");
					}
					System.out.println();
				}
			
		}

}


