package entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;
    public String finalResult;
    public double missingPoints;

    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }

    public String finalResult(){
        if ((grade1 + grade2 + grade3) >= 60){
             finalResult = "Pass";
        } else {
             finalResult = "Failed";
        }
        return finalResult;
    }

    public double pointsToPass(){
        if((grade1 + grade2 + grade3) < 90){
            missingPoints = 60 - (grade1 + grade2 + grade3);
        } else {
            missingPoints = 0;
        }
        return missingPoints;
    }
}
