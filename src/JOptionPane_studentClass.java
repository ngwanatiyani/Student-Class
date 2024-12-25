/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joptionpane_studentclass;
import javax.swing.JOptionPane;
/**
 *
 * @author Tiyani Ngwana
 */
public class JOptionPane_studentClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Collect user input
        
        String studentName = JOptionPane.showInputDialog("Student name: ");
        String ID = JOptionPane.showInputDialog("Student ID: ");
        int studentID = Integer.parseInt(ID);

        String gradesInput = JOptionPane.showInputDialog("Enter grades (comma-separated): ");
        String[] gradesArray = gradesInput.split(",");
        
        double[] studentGrades = new double[gradesArray.length];
        
        for (int i = 0; i < gradesArray.length; i++) {
            studentGrades[i] = Double.parseDouble(gradesArray[i]);
        }

        // Initialize the object
        studentClass student = new studentClass(studentName, studentID, studentGrades);

        // Create the output string
        String input = String.format(
                "Student Name: %s\n" +
                "Student ID: %d\n" +
                "Average Grade: %.2f",
                student.getStudentName(),
                student.getStudentID(),
                student.Average()
        );

        JOptionPane.showMessageDialog(null, input);
        
    }
    
}
