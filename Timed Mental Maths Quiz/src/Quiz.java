import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class Quiz {

	public static void main(String[] args) {
		
		
		
		
		
		System.out.println("[1] Addition\n[2] Subtraction\n[3] Multiplication\n[4] Division");
		String option = "";
		Scanner scanner = new Scanner(System.in);
		option = scanner.nextLine();
		//System.out.println("You chose: " + option);
		int l_bound, u_bound, noOfQuestions, timer;
		System.out.println("How many questions?");
		noOfQuestions = scanner.nextInt();
		System.out.println("Pick lower bound");
		l_bound = scanner.nextInt();
		System.out.println("Pick upper bound");
		u_bound = scanner.nextInt();
		System.out.println("How many seconds for each question?");
		timer = scanner.nextInt();
		
		Random random = new Random();
		//random.nextInt(l_bound, u_bound+1);
		
		
		/*
		for(int i = 0; i < 15; i++) {
			System.out.println(random.nextInt(l_bound, u_bound+1));
		}
		*/
		
		int num1 = 0, num2 = 0;
		int answer;
		int correct = 0;
		
		switch(option) {
		
		case "1":
			
			for(int i = 0; i < noOfQuestions; i++) {
				num1 = random.nextInt(l_bound, u_bound+1);
				num2 = random.nextInt(l_bound, u_bound+1);
				System.out.println("What is " + num1 + " + " + num2);
				long startTime = System.currentTimeMillis(); //log time before user answers 
				answer = scanner.nextInt();
				long endTime = System.currentTimeMillis(); //log time after they answer 
				long elapsed_time = (endTime - startTime) / 1000; // ms --> s
				if(elapsed_time > timer) {
					System.out.println("took too long");
				}
				else if(answer == num1 + num2) {
					System.out.println("correct");
					System.out.println("took " + elapsed_time + " seconds");
					correct++;
				}
				else {
					System.out.println("wrong");
				}
			}
			System.out.println("Score: " + correct + "/" + noOfQuestions);
			break;
			
		case "2":
			for(int i = 0; i < noOfQuestions; i++) {
				num1 = random.nextInt(l_bound, u_bound+1);
				num2 = random.nextInt(l_bound, u_bound+1);
				System.out.println("What is " + num1 + " - " + num2);
				long startTime = System.currentTimeMillis(); //log time before user answers 
				answer = scanner.nextInt();
				long endTime = System.currentTimeMillis(); //log time after they answer 
				long elapsed_time = (endTime - startTime) / 1000; // ms --> s
				if(elapsed_time > timer) {
					System.out.println("took too long (" + elapsed_time + "s)");
				}
				else if(answer == num1 - num2) {
					System.out.println("correct");
					System.out.println("took " + elapsed_time + " seconds");
					correct++;
				}
				else {
					System.out.println("wrong");
				}
			}
			System.out.println("Score: " + correct + "/" + noOfQuestions);
			break;
		
		case "3":
			for(int i = 0; i < noOfQuestions; i++) {
				num1 = random.nextInt(l_bound, u_bound+1);
				num2 = random.nextInt(l_bound, u_bound+1);
				System.out.println("What is " + num1 + " x " + num2);
				long startTime = System.currentTimeMillis(); //log time before user answers 
				answer = scanner.nextInt();
				long endTime = System.currentTimeMillis(); //log time after they answer 
				long elapsed_time = (endTime - startTime) / 1000; // ms --> s
				if(elapsed_time > timer) {
					System.out.println("took too long (" + elapsed_time + "s)");
				}
				else if(answer == num1 * num2) {
					System.out.println("correct");
					System.out.println("took " + elapsed_time + " seconds");
					correct++;
				}
				else {
					System.out.println("wrong");
				}
			}
			System.out.println("Score: " + correct + "/" + noOfQuestions);
			break;
		
		case "4":
			boolean divisible = false;
			for(int i = 0; i < noOfQuestions; i++) {
				divisible = false;
				while(!divisible) {
					num1 = random.nextInt(l_bound, u_bound+1);
					num2 = random.nextInt(l_bound, u_bound+1);
					if(num1 % num2 == 0 && num1 != num2) {
						divisible = true;
					}
				}
				
				System.out.println("What is " + num1 + " / " + num2);
				long startTime = System.currentTimeMillis(); //log time before user answers 
				answer = scanner.nextInt();
				long endTime = System.currentTimeMillis(); //log time after they answer 
				long elapsed_time = (endTime - startTime) / 1000; // ms --> s
				if(elapsed_time > timer) {
					System.out.println("took too long (" + elapsed_time + "s)");
				}
				else if(answer == num1 / num2) {
					System.out.println("correct");
					System.out.println("took " + elapsed_time + " seconds");
					correct++;
				}
				else {
					System.out.println("wrong");
				}
			}
			System.out.println("Score: " + correct + "/" + noOfQuestions);
			break;
		
		
		}

	}

}
