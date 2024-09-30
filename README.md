# F27SA Software Development 1 Lab 3

This week's lab will build a math test application for early math learners. We want to test their ability with even and odd numbers. 
Program Description
The application will test students' ability to identify even and odd numbers by asking five numbers between 0 and 100. The student should enter the answer, and the application should mark the accuracy of the student.
Required Specification:
Design and implement a program with the below specifications:
1. The application should show the student a number and ask the user to identify the number as even (e) or odd (o).
2. The application should display the result of the entry as correct or incorrect.
3. After five rounds, the application should show the student's mark. 
4. When done, the application should ask the student for the next try.
	
Optional Specification:
5. Implement the out of 100 marks. 
6. Identify the mark range based on the below table.
|||
|---------|--|
|Above 70 |	A|
|Between 60 and 70 |B|
|Between 50 and 60 |C|
|Between 40 and 50 |D|
|Below 40|F|
```
Sample Output 
Welcome to HW Math Test:
************************
What is 2, even or odd (e/o)? >e
2 is Even. You are correct.
You answered 1 correct out of 1
What is 36, even or odd (e/o)? >e
36 is Even. You are correct.
You answered 2 correct out of 2
What is 61, even or odd (e/o)? >e
61 is Odd. That is incorrect.
You answered 2 correct out of 3
What is 37, even or odd (e/o)? >o
37 is Odd. You are correct.
You answered 3 correct out of 4
What is 93, even or odd (e/o)? >e
93 is Odd. That is incorrect.
You answered 3 correct out of 5
Your Total Mark is 3/5
Do you want to try again (y/n)?y


```

Appendix

How to generate a random number between 0 and 100 in Java
```
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random random = new Random();
		random.nextInt(100);
		System.out.print(random.nextInt(100));

	}

}
```