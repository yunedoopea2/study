package s12_array;

import java.util.Scanner;

public class ExampleAplication {
	public static void main(String[] args) {
		boolean run = true;
		
		int studentNum = 0;
		int[] scores = null;
		
//		@SuppressWarnings("resource");
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("----------------------------------------");
			
			System.out.println("����> ");
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1: {
				System.out.println("�л���> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				break;
			}
			case 2: {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]> ");
					scores[i] = scanner.nextInt();
				}
				break;
			}
			case 3: {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]: "+scores[i]);
				}
				break;
			}
			case 4: {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i=0; i<scores.length; i++) {
					max = (max<scores[i])? scores[i]:max;
					sum += scores[i];
				}
				avg = (double)sum/scores.length;
				System.out.println("�ְ� ����: "+max);
				System.out.println("��� ����: "+avg);
				break;
			}
			case 5: {
				break;
			}
			}
		}
	}
}