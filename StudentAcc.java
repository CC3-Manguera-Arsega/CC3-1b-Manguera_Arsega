/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentacc;

public class StudentAcc {
    
    public static void main(String[] args) {
        StudentInfo student = new StudentInfo("CITCS", "2nd Term 2018-2019");
        System.out.println("==============================");
        student.setIdnumber("17-5537-657");
        student.setfamilyName("Manguera, ");
        student.setfirstname("John Cedrick");
        student.setacademicprogram("BSIT ");
        student.settrack("- Net Sec");
        student.print();
        
        
        
    }
    
}
