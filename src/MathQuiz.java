import java.util.Random;
import java.util.Scanner;
public class MathQuiz {

	public static void main(String[] args) {
		
		System.out.println("Welcome to HW Math Test");
		System.out.println("***********************");
		
		Scanner scanner = new Scanner(System.in);
		
		int total = 0;
		int count = 0;
		int ii = 0;
		
		while(ii==0) {
		
		for (int i = 0; i < 5; i++) {
		
			Random random = new Random();
			
			int randomINT = random.nextInt(100);
			
			System.out.print("What is "+randomINT+", even or odd (e/o)?");
			String eORo = scanner.nextLine();
			
			if (randomINT % 2 == 0) {
				if (eORo.compareTo("e") == 0) {
					System.out.println(randomINT+" is Even. You are correct");
					total = total+1;
					count = count+1;
					System.out.println("You answered "+total+" correct out of "+count);
				}else{
					System.out.println(randomINT+" is Even. You are wrong");
					count = count+1;
					System.out.println("You answered "+total+" incorrect out of "+count);
				}
			}
			
			if (randomINT % 2 == 1) {
				if (eORo.compareTo("o") == 0) {
					System.out.println(randomINT+" is Odd. You are correct");
					total = total+1;
					count = count+1;
					System.out.println("You answered "+total+" correct out of "+count);
				}else{
					System.out.println(randomINT+" is Odd. You are wrong");
					count = count+1;
					System.out.println("You answered "+total+" incorrect out of "+count);
				}
			}
			
		}
		
		System.out.println("Your Total Mark is "+total+"/5");
		System.out.println("Do you want to try again (y/n)");
		String yOrn = scanner.nextLine();
		
		if (yOrn.compareTo("n") == 0) {
		 ii = 1;
		 
		 double percentage = ((double)total/count)*100;
		 
		 System.out.println("Your percentage: "+percentage);
		 
		 if (percentage > 70) {
			 System.out.println("Your grade is A");
		 }
		 
		 if ((percentage >= 60)&&(percentage <=70)) {
			 System.out.println("Your grade is B");
		 }
		 
		 if ((percentage >= 50)&&(percentage <60)) {
			 System.out.println("Your grade is C");
		 }
		 
		 if ((percentage >= 40)&&(percentage <50)) {
			 System.out.println("Your grade is D");
		 }
		  
		 if (percentage < 40) {
			 System.out.println("Your grade is F");
		 }
		 
		}
		
		}
		
		}
	}

