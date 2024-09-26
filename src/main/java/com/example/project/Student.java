

public class Student {
    // instance variables
    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores; //should start at 0.0
    private int testScoreCount; //should start at 0
    private double highestTestScore; //should start at 0.0
 
 
    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        accumulatedTestScores = 0.0;
        testScoreCount = 0;
        highestTestScore = 0.0;
    }
 
 
    // returns firstName
    public String getFirstName() {
        return firstName;
    }
 
 
    // returns lastName
    public String getLastName() {
        return lastName;
    }
 
 
    public double getHighestTestScore() {
        return highestTestScore;
    }

    public int getTestScoreCount(){
        return s.testScoreCount;
    }

    public int getGradYear(){
        return gradYear;
    }
 
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }
 
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    public void addTestScore(double newTestScore) {
        accumulatedTestScores += newTestScore;
        testScoreCount++;
        if (newTestScore > highestTestScore) {
            highestTestScore = newTestScore;
        }
    }
 
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        if (averageTestScore() >= 65) {
            return true;
        } else {
            return false;
        }
    }
 
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        double average = accumulatedTestScores / testScoreCount;
        return average;
    }
 
 
    // this method prints all info of a Student object to the console
    public void printStudentInfo() {
        System.out.println("Student Full Name: " + firstName + " " + lastName);
        System.out.println("Graduation Year: " + gradYear);
        System.out.println("Number of tests: " + testScoreCount);
        System.out.println("Average Test Score: " + averageTestScore());
        System.out.println("Highest Test Score: " + highestTestScore);
        System.out.println("Is passing: " + isPassing());
    }
 }
 