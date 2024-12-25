/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joptionpane_studentclass;

/**
 *
 * @author Tiyani
 */
public class studentClass 
{
    private String studentName;
    private int studentID;
    private double [] studentGrades;

 
    public studentClass()
    {
    
        this.studentName = "";
        this.studentID = 0;
        this.studentGrades = new double [0];
    }
    
    public studentClass(String studentName, int studentID, double[] studentGrades) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentGrades = studentGrades;
    }
    
     public String getStudentName() 
     {
        return studentName;
    }

    public int getStudentID() 
    {
        return studentID;
    }

    public double[] getStudentGrades() 
    {
        return studentGrades;
    }
    
     public void setStudentName(String studentName) 
     {
        this.studentName = studentName;
    }

    public void setStudentID(int studentID) 
    {
        this.studentID = studentID;
    }

    public void setStudentGrades(double[] studentGrades) 
    {
        this.studentGrades = studentGrades;
    }

    public double Average()
    {
          double sum = 0;
        if (studentGrades.length == 0) 
        {
            return 0;
        }
        for (double studentGrade : studentGrades) 
        {
            sum += studentGrade;
        }
        return sum / studentGrades.length;
       
    }
    
    
}
