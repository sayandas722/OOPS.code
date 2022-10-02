import java.util.*;

public class examination_marking_system {
    public static void main(String[] args) {
        Result Ned = new Result("Ned", 20, 3, "Math", true, true, 30);
        Ned.displayResult();
        System.out.println("");
        Result Sam = new Result("Sam", 19, 1, "Physics", false, false, 27);
        Sam.displayResult();
        System.out.println("");
        Result John = new Result("John", 45, 2, "Math", true, false, 34);
        John.displayResult();
    }
}

// interface for defining the rewards and penalty marks
interface Achievement {
    static int grace = 10;
    static int penalty = -5;
}

// Registration class, serves as the superclass for Student
abstract class Registration {
    public String name;
    public int year;
    public String subject;

    abstract void displayStudent();

}

// once registered, a professor and roll number is assigned. Student class
// is the subclass of registration
class Student extends Registration {
    // Professor XYZ is assigned for math course
    // Professor ABC is assigned otherwise
    public String professor;
    public int roll;

    public void assignProf() {
        if (subject == "Math")
            professor = "XYZ";
        else
            professor = "ABC";
    }

    // method to view information about the student
    public void displayStudent() {
        System.out.println(name);
        System.out.println("Roll no.: " + roll);
        System.out.println("Current year: " + year);
        System.out.println("Subject: " + subject);
        System.out.println("Professor: " + professor);
    }
}

// The Subclass of Student, Examprofile serves as a class to
// confirm if a student has achievement or penalties to be added
// to the result
class ExamProfile extends Student {
    public boolean achieved;
    public boolean punished;
    public int score;

    // method to view score of the student in exam
    public void showScore() {
        System.out.println("Score in exam: " + score);
        if (punished)
            System.out.println("Penalty deducted");
        else if (achieved)
            System.out.println("Achievement grace added");
    }
}

// Result calculates the final marks obtained by the student
class Result extends ExamProfile implements Achievement {
    public int marks;

    // constructor
    Result(String name, int roll, int year, String subject, boolean achieved, boolean punished, int score) {
        this.name = name;
        this.roll = roll;
        this.year = year;
        this.subject = subject;
        this.achieved = achieved;
        this.punished = punished;
        this.score = score;
    }

    // method to calculate the final marks scored by the student
    public void calculatedResult() {
        if (punished) {
            marks = score + penalty;
        } else if (achieved) {
            marks = score + grace;
        } else {
            marks = score;
        }
    }

    // method to display the final result of the student
    public void displayResult() {
        assignProf();
        displayStudent();
        showScore();
        calculatedResult();
        System.out.print("Total Marks: ");
        System.out.println(marks);

    }

}