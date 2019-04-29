package com.company;

import java.util.ArrayList;
import java.util.List;

/* A customised class for students school report called Report Card */
class ReportCard {

    /* initialise variables in ReportCard */

    private String StudentName;
    private String MathGrade;
    private String EnglishGrade;
    private String HistoryGrade;
    private String BiologyGrade;
    private String FrenchGrade;

    /* Constructor for creating a new ReportCard object
    @param studentName
    @param mathsGrade
    @param englishGrade
    @param historyGrade
    @param biologyGrade
    @param frenchGrade
     */
    public ReportCard(String studentName, String mathGrade, String englishGrade, String historyGrade, String biologyGrade, String frenchGrade) {
        this.StudentName = studentName;
        this.MathGrade = mathGrade;
        this.EnglishGrade = englishGrade;
        this.HistoryGrade = historyGrade;
        this.BiologyGrade = biologyGrade;
        this.FrenchGrade = frenchGrade;

    }

    /* Get StudentName */
    public String getName() {
        return StudentName;
    }

    /* Set StudentName */
    public void setStudentName(String studentName) {
        this.StudentName = studentName;
    }

    /* Get MathGrade */
    public String getMathGrade() {
        return MathGrade;
    }

    /* Set MathGrade */
    public void setMathGrade(String mathGrade) {
        this.MathGrade = mathGrade;
    }

    /* Get EnglishGrade */
    public String getEnglishGrade() {
        return EnglishGrade;
    }

    /* Set EnglishGrade */
    public void setEnglishGrade(String englishGrade) {

        this.EnglishGrade = englishGrade;
    }

    /* Get HistoryGrade */
    public String getHistoryGrade() {
        return HistoryGrade;
    }

    /* Set HistoryGrade */
    public void setHistoryGrade(String historyGradeGrade) {

        this.HistoryGrade = historyGradeGrade;
    }

    /* Get BiologyGrade */

    public String getBiologyGrade() {
        return BiologyGrade;
    }

    /* Set BiologyGrade */
    public void setBiologyGrade(String biologyGrade) {

        this.BiologyGrade = biologyGrade;
    }

    /*  Get FrenchGrade */
    public String getFrenchGrade() {
        return FrenchGrade;
    }

     /* Set FrenchGrade */

    public void setFrenchGrade(String frenchGrade) {
       this.FrenchGrade = frenchGrade;
}

    }


class ArrayListUserDefinedObjectExample {
    public static void main(String[] args) {

        ArrayList<ReportCard> result = new ArrayList<>();
        result.add(new ReportCard("Harry Williams", "A",  "B",   "A+",  "D",  "B"));
	    result.add(new ReportCard("Mike Tyson",     "B",  "C",   "D-",  "A+", "B"));
	    result.add(new ReportCard("Juliet Ibrahim", "C",  "B",   "D",   "F", "A"));
	    result.add(new ReportCard("Brian Jones",    "A+", "F",   "D",   "A", "C"));
	    result.add(new ReportCard("Dupe Martins",   "D",  "C",   "B",   "A", "A+"));

	    /* Displaying the result of student names grade in all subjects with strings output
	    using forEach lambada expression rather than a for loop
	     */
        result.forEach(user ->  {
	    System.out.println("Name: "  + user.getName() + ", MathGrade: " + user.getMathGrade() + ", EnglishGrade: " + user.getEnglishGrade() + ", HistoryGrade: " +
                user.getHistoryGrade() + ", BiologyGrade: " + user.getBiologyGrade() + ", FrenchGrade: " + user.getFrenchGrade());

        });

    }
}
