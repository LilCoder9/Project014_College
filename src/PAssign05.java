import java.util.*;
public class PAssign05 {
	public static void main(String[] args) throws java.io.IOException {
		
		ArrayList<CourseGrade> row = new ArrayList<CourseGrade>();
		//java to file / file to java
		java.io.File read = new java.io.File("src/grades.txt");
		java.io.File write = new java.io.File("src/finalgrades.txt");
		
		Scanner input = new Scanner(read);
		//makes sure the file thats about to be written doesn't exist
		if(write.exists()) {
			System.out.println("File already exist");
			System.exit(0);
		} 
			//reads the grades file space by space(loops collects data and refresh row)
			while(input.hasNext()) {
			String fir = input.next();
			String last = input.next();
			String FuName = fir + " "+ last;
			//collects the 6 grades
			double[] total = new double[6];
			for(int i = 0;i < total.length; i++) {
				total[i] = input.nextInt();
			}
			//store data in ArrayList
			row.add(new CourseGrade(FuName, total));
		}
			try(java.io.PrintWriter output = new java.io.PrintWriter(write)){
			//prints out the ArrayList data from the file
		printGrade(row,output);
			}
			//idk it does stuff
			input.close();
			
	}

//method that actually prints the data
static void printGrade(ArrayList<CourseGrade> printer, java.io.PrintWriter write ) {
	for(int i=0; i < printer.size(); i++) {
		write.printf("%s,%.02f,%s\n",printer.get(i).getName(), printer.get(i).AVG,printer.get(i).getLetterGrade());
	}
}

}

class CourseGrade {
	//initiz the values
	private String name;
	private double[] grade = new double [6];
	private double[] weight = {0.105, 0.105, 0.18, 0.18, 0.18, 0.25};
	double AVG = 0;
	
//constructor that has grade parameter and gets the average grade
CourseGrade(double[] grade) {
	this.grade = grade;
	this.AVG = this.calcWeightedAvg();
}
//the actual constructor that be used in main arg
CourseGrade(String name, double[] grade){
	this(grade);
	setName(name);
}
// getter and setter for name
String getName() {
	return this.name;
}
private void setName(String name){
	this.name = name;
}
//getter and setter for grades
double[] getGrades() {
	return this.grade;
}
private void setGrades(double [] grades){
	this.grade = grades;
}
//calculate the Average grade 
private double calcWeightedAvg() {
	double temp;
	for(int i =0; i < grade.length; i++){
		temp = weight[i] * grade[i];
		AVG = AVG + temp;
	}
	return AVG;
}
//gives letter grade to the grade
String getLetterGrade() {
	if(AVG >= 90) return "A";
	if(AVG >= 80) return "B";
	if(AVG >= 70) return "C";
	if(AVG >= 60) return "D";
	else return "F";
	}
}

