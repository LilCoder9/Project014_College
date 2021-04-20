
public class notes {
/*Overview
Write a Java program that:
-	Reads in data from a text file (grades.txt)
-	Creates an ArrayList of CourseGrade (description is given later) instances
-	Processes those instances
-	Writes a file (finalGrades.txt) with student names, calculated grades, and letter grades
-	Handles exceptions

CourseGrade:
Create a CourseGrade class that has the following data members: 
-	A student name
-	a grades array that contains 6 elements, each representing that student’s grade in a course category.  The categories and their weights are:  homework (10.5%), projects (10.5%), exam1 (18%), exam2 (18%), exam3 (18%), and final exam (25%).
-	There should be a default constructor that creates the grade array
-	A convenience constructor that calls the default constructor and allows the student name and grades to be set on creation.
-	The accessor/mutator for the grades data member should use arrays to process data, not single values.
-	There should be a public method (calcWeightedAvg) to calculate the weighted average based on the student’s grades and the static weights (described below) for those grades.
-	The weights should be stored in an array of doubles shared among all instances of the CourseGrade class.  This array should not have a mutator method but needs to have an accessor method.  For simplicity, initialize the weight values on array declaration/creation. Recall that a weighted average of data   with weights   is computed according to the formula    where n is the length of the data.
-	There should be a public method (getLetterGrade) which returns the letter grade based on the calculated average. (>=90 is A, >=80 is B, >=70 is C, >=60 is D, else F)



Input File (grades.txt):
Data for the CourseGrade instances are in the “grades.txt” file provided in folio with this project.  Grades are listed with a student name, then the student’s grades as 6 doubles.  These grades are listed in the same order as the categories/weights from above.

The Main Program (PAssign05)
-	Create a Java program that reads in the provided file and uses the contained data to create an ArrayList of instances of CourseGrades.
-	Once the file has been processed completely, use the ArrayList to determine final numeric grades for each student. The program should classify each numeric grade into a letter grade.
-	A separate file named finalGrades.txt should be created with the name of the student, their final numeric grade (2 decimal places), and their final letter grade together on a single line separated by commas and should contain one line for every student in the original data file (5 students).
-	The program should use try-with-resources to auto-close eligible resources that are created.  It should also detect and handle a FileNotFoundException by printing an error message as well as the original Exception’s message.  Catch and handle all other exceptions with a generic error message and use a finally block to indicate (give output to the console) the completion of file processing.

Notes
●	Your program should generate one text file:  finalGrades.txt.
●	Be aware of how your IDE arranges projects, packages, and source code.  For instance, many IDEs place source files in a directory named src.  Your File objects will not be created correctly if the directory structure does not match your instantiation.
o	File file = new File(“test.txt”); is not the same as File file = new File(“src/test.txt”);
●	Make sure to calculate and use percentages correctly in all locations.
●	Hand-calculate some of the grades to make sure you are getting the correct output.
●	Make extensive use of the debugger to determine what is happening in your code and what values you are storing/using.

Expected Output
For instance, for a student/grades like:
Zechariah Ortega 91 71 91 95 93 99

There should be an entry in finalGrades.txt of:
Zechariah Ortega,91.98,A

***See attached grades.txt and corresponding finalGrades.txt for reference.

 

Code
To simplify submission into a single Java file, use the provided template for your class.  Make changes to the class headers as necessary.

public class PAssign05 {
	public static void main(String[] args) {
// your code here
	}
}

class CourseGrade {
}


Deliverables
Name your program PAssign05.java.  Programming Assignment 5 is to be individual work.  Submit the program by the due date specified. 

Last modified:  March 22, 2021
*/
}
